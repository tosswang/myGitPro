package �̶̳�д��ѧϰ.дд����;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service
{
	private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
	public void read()
	{
		try
		{
			lock.readLock().lock();
			System.out.println("��ö������߳��ǣ�"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(10000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println(Thread.currentThread().getName()+"�ͷ�����");
			lock.readLock().unlock();
		}
	}
	
	public void write()
	{
		try
		{
			lock.writeLock().lock();
			System.out.println("���д�����߳��ǣ�"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println(Thread.currentThread().getName()+"�ͷ�����");
			lock.writeLock().unlock();
		}
	}
}
