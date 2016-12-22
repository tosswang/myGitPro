package 教程试图获得锁.学习4;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	private ReentrantLock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	public void waitMethod()
	{
		try
		{
			Calendar  calendarRef=Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 10);
			lock.lock();
			System.out.println("wait开始时间="+System.currentTimeMillis());
			/**
			 * 调用该方法的前提是，当前线程已经成功获得与该条件对象绑定的重入锁，否则调用该方法时会抛出IllegalMonitorStateException。
			 * 太晦涩，其实就是说要想调用await方法或sign方法的前提是线程首先获得锁，否则，直接调用这些方法就会抛出IllegalMonitorStateException
			 * **/
			/**
			 * awaitUntil方法在给定时间内是否收到收到signal()或signalALL()信号，
			 * 这个方法没在指定时间没有收到信号的话会从等待队列中自动出来，争抢锁，抢到后，接着
			 * 执行剩余代码，并释放锁
			 * **/
			boolean  tag=condition.awaitUntil(calendarRef.getTime());
			System.out.println(tag);
			System.out.println("wait结束时间="+System.currentTimeMillis());
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("捕获");
		}
		finally
		{
			System.out.println(Thread.currentThread().getName()+"释放了锁");
			lock.unlock();
		}
	}
	
	public void notifyMethod()
	{
		try
		{
			lock.lock();
			System.out.println("notify开始时间="+System.currentTimeMillis());
			condition.signalAll();
			System.out.println("notify结束时间="+System.currentTimeMillis());
		}
		finally
		{
			System.out.println(Thread.currentThread().getName()+"释放了锁");
			lock.unlock();		
		}
		
	}
}
