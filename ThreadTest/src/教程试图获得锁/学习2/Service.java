package �̳���ͼ�����.ѧϰ2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	public ReentrantLock lock=new ReentrantLock();
	public void waitMethod()
	{
		try
		{
			if(lock.tryLock(3,TimeUnit.SECONDS))
			{
				System.out.println(Thread.currentThread().getName()+" �������ʱ�� "+System.currentTimeMillis());
				/***
				 * ����߳�������ʱ��û�����������̣߳�����3����ٴ���ͼ����������ʱ�������û��ռ�ã���������û��û���жϣ��͸Ͻ���ռ��
				 * ������ʼ��������ǿ����ģ���ô��һ���߳�ռ�������������߳���Ҫ��3����ٴ������ģ�����������һ����˯10�룬�����ζ����
				 * ��3�����û�б��ͷţ����ԣ������߳�3��󲻻���������Ҳ����Զʧȥ�������Ļ��ᣬ���п�֪��10����������򶼽����ˣ�����
				 * ע������Ϳ���������
				 * **/
				//Thread.sleep(10000);
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
			if(lock.isHeldByCurrentThread())
			{
				System.out.println(Thread.currentThread().getName()+"�ͷ���");
				lock.unlock();			
			}
		}
	}
	
	
}
