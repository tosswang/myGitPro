package 教程公平锁非公平锁学习.wait中等待的线程函数学习;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	private ReentrantLock lock=new ReentrantLock();
	private Condition newCondition=lock.newCondition();
	public void waitMethod()
	{
		try
		{
			lock.lock();
			System.out.println("正在进入await队列的线程"+Thread.currentThread().getName());
			newCondition.await();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			System.out.println("正在释放锁的线程"+Thread.currentThread().getName());
			lock.unlock();			
		}
	}
	
	public void notifyMethod()
	{
		try
		{
			lock.lock();
			System.out.println("有"+lock.getWaitQueueLength(newCondition)+"个线程正在等待newCondition");
			newCondition.signalAll();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			System.out.println("正在释放锁的线程1"+Thread.currentThread().getName());
			lock.unlock();
		}
	}
}
