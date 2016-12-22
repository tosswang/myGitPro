package 教程读写锁学习.读读共享;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service
{
	private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
	public void read()
	{
		try
		{
			lock.readLock().lock();
			System.out.println("获得读锁的线程是："+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(10000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println(Thread.currentThread().getName()+"释放了锁");
			lock.readLock().unlock();
		}
	}
}
