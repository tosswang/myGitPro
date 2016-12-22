package �̳�reentranlock_conditionʵ��������������.ѧϰ2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService
{
	private Lock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	private boolean hasValue=false;
	
	public void set()
	{
		try
		{
			lock.lock();
			while(hasValue==true)
			{
				System.out.println("�п��ܡ������");
				/***����ȴ����У��ͷ�����û���˻��ѵĻ�������һֱ
				 * �ڵȴ����е��Ų����κ����飬����˵���������ܳ�ȥ������
				 */
				condition.await();
			}
			System.out.println("��ӡ ��");
			hasValue=true;
			condition.signalAll();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
	}
	
	public void get()
	{
		try
		{
			lock.lock();
			while(hasValue==false)
			{
				System.out.println("�п��ܡ������");
				condition.await();
			}
			System.out.println("��ӡ ��");
			hasValue=false;
			condition.signalAll();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
	}
}
