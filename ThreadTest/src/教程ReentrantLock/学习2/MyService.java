package �̳�ReentrantLock.ѧϰ2;

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
			System.out.println("����Aִ���̣߳�"+Thread.currentThread().getName());
			Thread.sleep(500);
			System.out.println("����Aִ���߳���ϣ�"+Thread.currentThread().getName());
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
			System.out.println("����Bִ���̣߳�"+Thread.currentThread().getName());
			Thread.sleep(500);
			System.out.println("����Bִ���߳���ϣ�"+Thread.currentThread().getName());
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
