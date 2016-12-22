package �̳�ReentrantLock.condition��������һ���߳�;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService
{
	private Lock lock=new ReentrantLock();
	private Condition conditionA=lock.newCondition();
	private Condition conditionB=lock.newCondition();
	public void awaitA()
	{
		try
		{
			lock.lock();
			System.out.println("��ʼ awaitA����ʱ��"+System.currentTimeMillis()+" ���е��߳�Ϊ��"+Thread.currentThread().getName());
			conditionA.await();//��wait����һ��������÷ŵ�ͬ��������в���,ͬʱ���ͷ���
			System.out.println("���� awaitA����ʱ��"+System.currentTimeMillis()+" ���е��߳�Ϊ��"+Thread.currentThread().getName());
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
	
	public void awaitB()
	{
		try
		{
			lock.lock();//�൱��synchronize(this)
			System.out.println("��ʼ awaitB����ʱ��"+System.currentTimeMillis()+" ���е��߳�Ϊ��"+Thread.currentThread().getName());
			conditionB.await();//��wait����һ��������÷ŵ�ͬ��������в��У�ͬʱ���ͷ���
			System.out.println("���� awaitB����ʱ��"+System.currentTimeMillis()+" ���е��߳�Ϊ��"+Thread.currentThread().getName());
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
	
	public void signalAll_A()
	{
		try
		{
			lock.lock();
			System.out.println("Ŀǰ���е��߳�"+Thread.currentThread().getName());
			conditionA.signalAll();//��ͬ��notify�������ỽ��await�ȴ������е��̣߳������������ͷ�������Ҫִ����������ͷ���
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
	
	public void signalAll_B()
	{
		try
		{
			lock.lock();
			System.out.println("Ŀǰ���е��߳�"+Thread.currentThread().getName());
			conditionB.signalAll();//��ͬ��notify�������ỽ��await�ȴ������е��̣߳������������ͷ�������Ҫִ����������ͷ���
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
}
