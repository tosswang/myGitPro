package com.richfit.test.productcustomer3;

public class Target {
private int count;
	
	public synchronized void increase()
	{
		if(count == 2)
		{
			try
			{
				wait();
				System.out.println("increase 之后执行");
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		count++;
		System.out.println(Thread.currentThread().getName() + ":" + count);
		notify();
	}
	
	public synchronized void decrease()
	{
		if(count == 0)
		{
			try
			{
				//等待，由于Decrease线程调用的该方法,
				//所以Decrease线程进入对象t(main函数中实例化的)的等待池，并且释放对象t的锁
				wait();//Object类的方法
				System.out.println("decrease 之后执行");
				/**
				 * 这里一整天因为强迫症来袭，简直就变成二货了，一直认为如果执行该方法的线程，第一次进入到这里时，wait()之后，会进入等待池，然后系统进行分配时，假设该线程得到了机会
				 * ，在锁池中拿到了锁,然后会执行wait()之后的语句，接着再次释放锁，然后系统再次分配给他机会，那么他会再次执行wait之后的方法......这不是水喝多了，大脑过于滋润了嘛！
				 * 当第一次执行完wait之后的语句，线程会释放锁，此时因为完整执行了代码，所以他当然不会进入等待池啊，是会进入对象的锁池啊，这样即使再次分配了锁给它，它也会重新
				 * 执行代码，怎么就想着是再次从wait之后执行代码呢，强迫症害死人啊
				 * **/
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		count--;
		System.out.println(Thread.currentThread().getName() + ":" + count);
		
		//唤醒线程Increase，Increase线程从等待池到锁池
		notify();
	}
}
