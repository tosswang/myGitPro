package com.richfit.test.cyclicbarrier;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTestOne
{

	public static void main(String[] args) throws IOException,
			InterruptedException
	{
		// 如果将参数改为4，但是下面只加入了3个选手，这永远等待下去
		// Waits until all parties have invoked await on this barrier.
		CyclicBarrier barrier = new CyclicBarrier(3);

		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(new Thread(new Runner(barrier, "1号选手")));
		executor.submit(new Thread(new Runner(barrier, "2号选手")));
		executor.submit(new Thread(new Runner(barrier, "3号选手")));

		executor.shutdown();
	}
}

class Runner implements Runnable
{
	// 一个同步辅助类，它允许一组线程互相等待，直到到达某个公共屏障点 (common barrier point)
	private CyclicBarrier barrier;

	private String name;

	public Runner(CyclicBarrier barrier, String name)
	{
		super();
		this.barrier = barrier;
		this.name = name;
	}

	@Override
	public void run()
	{
		try
		{
			Thread.sleep(1000 * (new Random()).nextInt(8));
			System.out.println(name + " 准备好了...");
			/***
			 * wyf的注释：用这个东西，首先要明确一个先决条件，就是，你自己很清楚，
			 * 我们有多个线程，我们要分开干事情，每个线程要做的事情是分步骤的，一般可以规划
			 * 为两步，第二步开干之前，大家要把第一步做好了，而且，不要着急，等大家伙一起做
			 * 完了，再一块执行第二步。这个东西就是用来干这个的；
			 * 本例子就是大家一起等着做完第一步，然后开干各自的第二步工作，这个是可以扩展的，
			 * 比如多个线程有执行读文件的，有执行读数据库的，然后把执行结果存一下，互相等一下
			 * 之后，读文件的可以用操作数据库的线程获得的数据做一些事情，操作数据库的可以用
			 * 操作文件的线程获得的数据做一些事情等等。
			 * 还有一个应用场景是大家一起做，然后把结果交给另一个线程去合并，比如网上说，可以
			 * 分多个线程去读取一个excel中的多个sheet页，然后统一交给一个线程去处理获得的数据
			 * 这个我再找找，我感觉应用还是挺广的
			 * ***/
			barrier.await();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		catch (BrokenBarrierException e)
		{
			e.printStackTrace();
		}
		System.out.println(name + " 起跑！");
	}
}
