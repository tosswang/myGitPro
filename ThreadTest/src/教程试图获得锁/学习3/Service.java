package 教程试图获得锁.学习3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	private ReentrantLock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	public void testMethod()
	{
		try
		{
			lock.lock();
			System.out.println("等待开始");
			condition.await();
			System.out.println("等待结束");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("捕获");
		}
		finally
		{
			System.out.println(Thread.currentThread().getName()+"释放了锁");
			/**中断的线程会自动释放锁**/
			lock.unlock();
		}
	}
	
	
}
