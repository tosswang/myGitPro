package 教程ReentrantLock.condition学习3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService
{
	private Lock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	public void awaitA()
	{
		try
		{
			lock.lock();
			System.out.println("开始 awaitA方法时间"+System.currentTimeMillis()+" 运行的线程为："+Thread.currentThread().getName());
			condition.await();//和wait方法一样，必须得放到同步代码段中才行,同时会释放锁
			System.out.println("结束 awaitA方法时间"+System.currentTimeMillis()+" 运行的线程为："+Thread.currentThread().getName());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
	}
	
	public void awaitB()
	{
		try
		{
			lock.lock();
			System.out.println("开始 awaitB方法时间"+System.currentTimeMillis()+" 运行的线程为："+Thread.currentThread().getName());
			condition.await();//和wait方法一样，必须得放到同步代码段中才行，同时会释放锁
			System.out.println("结束 awaitB方法时间"+System.currentTimeMillis()+" 运行的线程为："+Thread.currentThread().getName());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
	}
	
	public void signalAll()
	{
		try
		{
			lock.lock();
			condition.signalAll();//等同于notify方法，会唤醒await等待队列中的线程，但不会马上释放锁，需要执行完代码后才释放锁
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			lock.unlock();
		}
	}
}
