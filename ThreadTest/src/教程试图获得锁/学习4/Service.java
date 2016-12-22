package �̳���ͼ�����.ѧϰ4;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	private ReentrantLock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	public void waitMethod()
	{
		try
		{
			Calendar  calendarRef=Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 10);
			lock.lock();
			System.out.println("wait��ʼʱ��="+System.currentTimeMillis());
			/**
			 * ���ø÷�����ǰ���ǣ���ǰ�߳��Ѿ��ɹ���������������󶨵���������������ø÷���ʱ���׳�IllegalMonitorStateException��
			 * ̫��ɬ����ʵ����˵Ҫ�����await������sign������ǰ�����߳����Ȼ����������ֱ�ӵ�����Щ�����ͻ��׳�IllegalMonitorStateException
			 * **/
			/**
			 * awaitUntil�����ڸ���ʱ�����Ƿ��յ��յ�signal()��signalALL()�źţ�
			 * �������û��ָ��ʱ��û���յ��źŵĻ���ӵȴ��������Զ��������������������󣬽���
			 * ִ��ʣ����룬���ͷ���
			 * **/
			boolean  tag=condition.awaitUntil(calendarRef.getTime());
			System.out.println(tag);
			System.out.println("wait����ʱ��="+System.currentTimeMillis());
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("����");
		}
		finally
		{
			System.out.println(Thread.currentThread().getName()+"�ͷ�����");
			lock.unlock();
		}
	}
	
	public void notifyMethod()
	{
		try
		{
			lock.lock();
			System.out.println("notify��ʼʱ��="+System.currentTimeMillis());
			condition.signalAll();
			System.out.println("notify����ʱ��="+System.currentTimeMillis());
		}
		finally
		{
			System.out.println(Thread.currentThread().getName()+"�ͷ�����");
			lock.unlock();		
		}
		
	}
}
