package �̳�ReentrantLock.conditionѧϰ2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService
{
	private Lock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	public void awaitMethod()
	{
		try
		{
			lock.lock();
			System.out.println("A");
			condition.await();//��wait����һ��������÷ŵ�ͬ��������в���
			System.out.println("B");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
			System.out.println("���ͷ���");
		}
	}
}
