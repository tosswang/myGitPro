package �̳̹�ƽ���ǹ�ƽ��ѧϰ.��ȡ�ȴ������߳���Ϣ;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	public ReentrantLock lock=new ReentrantLock();
	public Condition newCondition=lock.newCondition();
	public void waitMethod()
	{
		try
		{
			lock.lock();
			newCondition.await();
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
	
	public void notifyMethod()
	{
		try
		{
			lock.lock();
			System.out.println("��û���߳����ڵȴ�newCondition��"+lock.hasWaiters(newCondition)+"�߳����Ƕ���"+lock.getWaitQueueLength(newCondition));
			newCondition.signal();
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
