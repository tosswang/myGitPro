package 教程试图获得锁.学习1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	public ReentrantLock lock=new ReentrantLock();
	public void waitMethod()
	{
		try
		{
			if(lock.tryLock())
			{
				System.out.println(Thread.currentThread().getName()+" 获得锁 ");
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" 未获得锁 ");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("正在释放锁的线程是："+Thread.currentThread().getName());
			/**没有获得锁的线程要干释放锁的事！！！！就会报出
			 * java.lang.IllegalMonitorStateException 异常！！！
			 * 就和公鸡下蛋，不是他的事他要干必定会出问题
			 * */
			lock.unlock();			
		}
	}
	
	
}
