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
			/**TMD,之前从网上扒下来的代码这里是有问题的，他的顺序是，把leaving方法放到了release之后了
			结果每次输出都感觉是一下进去了10多个车，其实是已经有的线程执行了release但是还没有执行leaving，
			离开的信息就没打出来，所以就让人摸不着头脑了，这个release方法只要调用
			相当于马上就释放锁了，其他线程马上就抢到了，这样的话，之前的线程再想执行leaving方法了，只能是再次去抢执行时间，把剩余的事情执行完。
			通过验证就可以知道了，另外，出现这种情况，就是因为jdk1.5之后引入的多线程都是采用的非阻塞方法
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
		System.out.println(String.format("%d号车泊车", carNo));
	}

	private void leaving()
	{
		System.out.println(String.format("%d号车离开车位", carNo));
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
