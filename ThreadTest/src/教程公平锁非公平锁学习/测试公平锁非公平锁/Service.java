package �̳̹�ƽ���ǹ�ƽ��ѧϰ.���Թ�ƽ���ǹ�ƽ��;

import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	private ReentrantLock lock;
	public Service(boolean isFair)
	{
		lock=new ReentrantLock(isFair);
	}
	
	public void serviceMethod()
	{
		try
		{
			lock.lock();
			System.out.println("���е��߳�����"+Thread.currentThread().getName()+" �������");
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			lock.unlock();
			System.out.println("���е��߳�����"+Thread.currentThread().getName()+" �ͷ�����");
		}
	}
}
