package �̳���ͼ�����.ѧϰ3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	private ReentrantLock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	public void testMethod()
	{
		try
		{
			lock.lock();
			System.out.println("�ȴ���ʼ");
			condition.await();
			System.out.println("�ȴ�����");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("����");
		}
		finally
		{
			System.out.println(Thread.currentThread().getName()+"�ͷ�����");
			/**�жϵ��̻߳��Զ��ͷ���**/
			lock.unlock();
		}
	}
	
	
}
