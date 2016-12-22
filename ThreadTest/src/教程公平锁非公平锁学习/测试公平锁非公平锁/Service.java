package 教程公平锁非公平锁学习.测试公平锁非公平锁;

import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	private ReentrantLock lock;
	public Service(boolean isFair)
	{
		lock=new ReentrantLock(isFair);
	}
	
	public void serviceMethod()
	{
		try
		{
			lock.lock();
			System.out.println("运行的线程名："+Thread.currentThread().getName()+" 获得锁定");
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			lock.unlock();
			System.out.println("运行的线程名："+Thread.currentThread().getName()+" 释放锁定");
		}
	}
}
