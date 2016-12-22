package 教程试图获得锁.学习2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	public ReentrantLock lock=new ReentrantLock();
	public void waitMethod()
	{
		try
		{
			if(lock.tryLock(3,TimeUnit.SECONDS))
			{
				System.out.println(Thread.currentThread().getName()+" 获得锁的时间 "+System.currentTimeMillis());
				/***
				 * 多个线程争夺锁时，没有抢到锁的线程，会在3秒后，再次试图争抢锁，此时如果该锁没人占用，并且自身没有没有中断，就赶紧抢占锁
				 * 本例开始下面语句是开发的，那么当一个线程占用了锁，其他线程是要在3秒后再次抢锁的，但是这里有一个沉睡10秒，这就意味着锁
				 * 在3秒后还是没有被释放，所以，其他线程3秒后不会抢到锁，也就永远失去了抢锁的机会，运行可知，10秒后，整个程序都结束了，但是
				 * 注销掉后就可以抢到了
				 * **/
				//Thread.sleep(10000);
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" 未获得锁 ");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(lock.isHeldByCurrentThread())
			{
				System.out.println(Thread.currentThread().getName()+"释放锁");
				lock.unlock();			
			}
		}
	}
	
	
}
