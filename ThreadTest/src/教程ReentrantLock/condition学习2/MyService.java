package 教程ReentrantLock.condition学习2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService
{
	private Lock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	public void awaitMethod()
	{
		try
		{
			lock.lock();
			System.out.println("A");
			condition.await();//和wait方法一样，必须得放到同步代码段中才行
			System.out.println("B");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
			System.out.println("锁释放了");
		}
	}
}
