package 教程试图获得锁.学习3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service1
{
	private ReentrantLock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	public void testMethod()
	{
		try
		{
			lock.lock();
			System.out.println("等待开始");
			/**即使获得锁的当前线程中断了，这里也不会释放锁，一直等着被唤醒*/
			condition.awaitUninterruptibly();
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
			lock.unlock();
		}
	}
}
