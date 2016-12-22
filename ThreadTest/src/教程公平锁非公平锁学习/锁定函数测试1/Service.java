package 教程公平锁非公平锁学习.锁定函数测试1;

import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	private ReentrantLock lock=new ReentrantLock();

	public void serviceMethod1()
	{
		try
		{
			lock.lock();
			/**lock.getHoldCount() 虽是
			 * lock的方法，但是它反映的是线程所
			 * 持有的锁，就是重入锁
			 * */
			System.out.println("serviceMethod1 getHoldCount="+lock.getHoldCount());
			serviceMethod2();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			lock.unlock();
			System.out.println("serviceMethod1 释放锁");
		}
	}
	
	public void serviceMethod2()
	{
		try
		{
			lock.lock();
			System.out.println("serviceMethod2 getHoldCount="+lock.getHoldCount());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			System.out.println("serviceMethod2 释放锁");
			lock.unlock();
			/**这里这么写就有问题，上一句都unlock了，你还在之后输出，就会出现意想不到的结果**/
			//System.out.println("serviceMethod2 释放锁");
		}
	}
}
