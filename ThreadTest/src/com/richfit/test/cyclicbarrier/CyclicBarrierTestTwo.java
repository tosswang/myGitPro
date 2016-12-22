package com.richfit.test.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/** */
/**
 * CyclicBarrier������CountDownLatchҲ�Ǹ���������
 * ��ͬ����CyclicBarrier�����ǵ�����CyclicBarrier.await()��¼�ȴ����߳�����---------------��������
 * ���߳����ﵽ��CyclicBarrier��ʼʱ�涨����Ŀʱ�����н���ȴ�״̬���̱߳����Ѳ�������
 * CyclicBarrier���������ֵ���˼һ�����ɿ����Ǹ��ϰ��� ���е��̱߳��뵽������һ��ͨ������ϰ���
 * CyclicBarrier��ʼʱ���ɴ�һ��Runnable�Ĳ�����
 * ��Runnable������CyclicBarrier����Ŀ�ﵽ�����������̱߳�����ǰ��ִ�С�------���Ҫ��֤
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
			barrier.await(); // ��ҵȴ����һ���̵߳���
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(id+":���ӵ�����");
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
