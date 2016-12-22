package com.richfit.test.semaphore;

import java.util.concurrent.Semaphore;

public class Car implements Runnable
{
	private final Semaphore parkingSlot;

	private int carNo;

	/**
	 * @param parkingSlot
	 * @param carName
	 */
	public Car(Semaphore parkingSlot, int carNo)
	{
		this.parkingSlot = parkingSlot;
		this.carNo = carNo;
	}

	public void run()
	{

		try
		{
			parkingSlot.acquire();
			parking();
			sleep(300);			
			leaving();
			/**TMD,֮ǰ�����ϰ������Ĵ���������������ģ�����˳���ǣ���leaving�����ŵ���release֮����
			���ÿ��������о���һ�½�ȥ��10���������ʵ���Ѿ��е��߳�ִ����release���ǻ�û��ִ��leaving��
			�뿪����Ϣ��û����������Ծ�����������ͷ���ˣ����release����ֻҪ����
			�൱�����Ͼ��ͷ����ˣ������߳����Ͼ������ˣ������Ļ���֮ǰ���߳�����ִ��leaving�����ˣ�ֻ�����ٴ�ȥ��ִ��ʱ�䣬��ʣ�������ִ���ꡣ
			ͨ����֤�Ϳ���֪���ˣ����⣬�������������������Ϊjdk1.5֮������Ķ��̶߳��ǲ��õķ���������
			**/
			parkingSlot.release();
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void parking()
	{
		System.out.println(String.format("%d�ų�����", carNo));
	}

	private void leaving()
	{
		System.out.println(String.format("%d�ų��뿪��λ", carNo));
	}

	private static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
