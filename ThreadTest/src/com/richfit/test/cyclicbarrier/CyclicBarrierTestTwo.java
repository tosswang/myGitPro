package com.richfit.test.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/** */
/**
 * CyclicBarrier类似于CountDownLatch也是个计数器，
 * 不同的是CyclicBarrier数的是调用了CyclicBarrier.await()记录等待的线程数，---------------如我所想
 * 当线程数达到了CyclicBarrier初始时规定的数目时，所有进入等待状态的线程被唤醒并继续。
 * CyclicBarrier就象它名字的意思一样，可看成是个障碍， 所有的线程必须到齐后才能一起通过这个障碍。
 * CyclicBarrier初始时还可带一个Runnable的参数，
 * 此Runnable任务在CyclicBarrier的数目达到后，所有其它线程被唤醒前被执行。------这个要验证
 */

class CyclicBarrierWorker implements Runnable
{
	private int id;
	private CyclicBarrier barrier;

	public CyclicBarrierWorker(int id, final CyclicBarrier barrier)
	{
		this.id = id;
		this.barrier = barrier;
	}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		try
		{
			System.out.println(id + " th people wait");
			barrier.await(); // 大家等待最后一个线程到达
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(id+":老子等完了");
	}
}

public class CyclicBarrierTestTwo
{

	public static void main(String[] args)
	{
		int num = 10;
		CyclicBarrier barrier = new CyclicBarrier(num, new Runnable() {
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				System.out.println("go on together!");
			}
		});
		for (int i = 1; i <= num; i++)
		{
			new Thread(new CyclicBarrierWorker(i, barrier)).start();
		}
	}
}
