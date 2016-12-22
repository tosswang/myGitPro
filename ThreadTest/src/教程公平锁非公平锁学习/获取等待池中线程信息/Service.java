package 教程公平锁非公平锁学习.获取等待池中线程信息;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	public ReentrantLock lock=new ReentrantLock();
	public Condition newCondition=lock.newCondition();
	public void waitMethod()
	{
		try
		{
			lock.lock();
			newCondition.await();
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
	
	public void notifyMethod()
	{
		try
		{
			lock.lock();
			System.out.println("有没有线程正在等待newCondition？"+lock.hasWaiters(newCondition)+"线程数是多少"+lock.getWaitQueueLength(newCondition));
			newCondition.signal();
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
