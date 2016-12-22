package 教程reentranlock_condition实现生产者消费者.学习2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService
{
	private Lock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	private boolean hasValue=false;
	
	public void set()
	{
		try
		{
			lock.lock();
			while(hasValue==true)
			{
				System.out.println("有可能★★连续");
				/***进入等待队列，释放锁，没有人唤醒的话，他就一直
				 * 在等待队列等着不做任何事情，就是说不会再乱跑出去抢锁了
				 */
				condition.await();
			}
			System.out.println("打印 ★");
			hasValue=true;
			condition.signalAll();
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
	
	public void get()
	{
		try
		{
			lock.lock();
			while(hasValue==false)
			{
				System.out.println("有可能☆☆连续");
				condition.await();
			}
			System.out.println("打印 ☆");
			hasValue=false;
			condition.signalAll();
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
}
