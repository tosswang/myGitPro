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
		// �����������Ϊ4����������ֻ������3��ѡ�֣�����Զ�ȴ���ȥ
		// Waits until all parties have invoked await on this barrier.
		CyclicBarrier barrier = new CyclicBarrier(3);

		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(new Thread(new Runner(barrier, "1��ѡ��")));
		executor.submit(new Thread(new Runner(barrier, "2��ѡ��")));
		executor.submit(new Thread(new Runner(barrier, "3��ѡ��")));

		executor.shutdown();
	}
}

class Runner implements Runnable
{
	// һ��ͬ�������࣬������һ���̻߳���ȴ���ֱ������ĳ���������ϵ� (common barrier point)
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
			System.out.println(name + " ׼������...");
			/***
			 * wyf��ע�ͣ����������������Ҫ��ȷһ���Ⱦ����������ǣ����Լ��������
			 * �����ж���̣߳�����Ҫ�ֿ������飬ÿ���߳�Ҫ���������Ƿֲ���ģ�һ����Թ滮
			 * Ϊ�������ڶ�������֮ǰ�����Ҫ�ѵ�һ�������ˣ����ң���Ҫ�ż����ȴ�һ�һ����
			 * ���ˣ���һ��ִ�еڶ��������������������������ģ�
			 * �����Ӿ��Ǵ��һ����������һ����Ȼ�󿪸ɸ��Եĵڶ�������������ǿ�����չ�ģ�
			 * �������߳���ִ�ж��ļ��ģ���ִ�ж����ݿ�ģ�Ȼ���ִ�н����һ�£������һ��
			 * ֮�󣬶��ļ��Ŀ����ò������ݿ���̻߳�õ�������һЩ���飬�������ݿ�Ŀ�����
			 * �����ļ����̻߳�õ�������һЩ����ȵȡ�
			 * ����һ��Ӧ�ó����Ǵ��һ������Ȼ��ѽ��������һ���߳�ȥ�ϲ�����������˵������
			 * �ֶ���߳�ȥ��ȡһ��excel�еĶ��sheetҳ��Ȼ��ͳһ����һ���߳�ȥ�����õ�����
			 * ����������ң��Ҹо�Ӧ�û���ͦ���
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
		System.out.println(name + " ���ܣ�");
	}
}
