package 教程ReentrantLock.学习2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService
{
	private Lock lock=new ReentrantLock();
	public void methodA()
	{
		
		try
		{
			lock.lock();
			System.out.println("方法A执行线程："+Thread.currentThread().getName());
			Thread.sleep(500);
			System.out.println("方法A执行线程完毕："+Thread.currentThread().getName());
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
	
	public void methodB()
	{
		
		try
		{
			lock.lock();
			System.out.println("方法B执行线程："+Thread.currentThread().getName());
			Thread.sleep(500);
			System.out.println("方法B执行线程完毕："+Thread.currentThread().getName());
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
