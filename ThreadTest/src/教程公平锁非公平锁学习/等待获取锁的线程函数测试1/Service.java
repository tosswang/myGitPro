package �̳̹�ƽ���ǹ�ƽ��ѧϰ.�ȴ���ȡ�����̺߳�������1;

import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	public ReentrantLock lock=new ReentrantLock();

	public void serviceMethod1()
	{
		try
		{
			lock.lock();
			System.out.println("�������е��̣߳�"+Thread.currentThread().getName());
			Thread.sleep(Integer.MAX_VALUE);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			lock.unlock();
			System.out.println("�����ͷ������߳�"+Thread.currentThread().getName());
		}
	}
}
