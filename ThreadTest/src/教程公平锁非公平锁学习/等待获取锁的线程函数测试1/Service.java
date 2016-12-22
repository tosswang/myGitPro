package 教程公平锁非公平锁学习.等待获取锁的线程函数测试1;

import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	public ReentrantLock lock=new ReentrantLock();

	public void serviceMethod1()
	{
		try
		{
			lock.lock();
			System.out.println("正在运行的线程："+Thread.currentThread().getName());
			Thread.sleep(Integer.MAX_VALUE);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			lock.unlock();
			System.out.println("正在释放锁的线程"+Thread.currentThread().getName());
		}
	}
}
