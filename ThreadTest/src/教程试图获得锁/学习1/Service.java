package �̳���ͼ�����.ѧϰ1;

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
				System.out.println(Thread.currentThread().getName()+" ����� ");
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" δ����� ");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("�����ͷ������߳��ǣ�"+Thread.currentThread().getName());
			/**û�л�������߳�Ҫ���ͷ������£��������ͻᱨ��
			 * java.lang.IllegalMonitorStateException �쳣������
			 * �ͺ͹����µ���������������Ҫ�ɱض��������
			 * */
			lock.unlock();			
		}
	}
	
	
}
