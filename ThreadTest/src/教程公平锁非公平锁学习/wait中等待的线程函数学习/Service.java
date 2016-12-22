package �̳̹�ƽ���ǹ�ƽ��ѧϰ.wait�еȴ����̺߳���ѧϰ;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	private ReentrantLock lock=new ReentrantLock();
	private Condition newCondition=lock.newCondition();
	public void waitMethod()
	{
		try
		{
			lock.lock();
			System.out.println("���ڽ���await���е��߳�"+Thread.currentThread().getName());
			newCondition.await();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			System.out.println("�����ͷ������߳�"+Thread.currentThread().getName());
			lock.unlock();			
		}
	}
	
	public void notifyMethod()
	{
		try
		{
			lock.lock();
			System.out.println("��"+lock.getWaitQueueLength(newCondition)+"���߳����ڵȴ�newCondition");
			newCondition.signalAll();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			System.out.println("�����ͷ������߳�1"+Thread.currentThread().getName());
			lock.unlock();
		}
	}
}
