package �̳�ReentrantLock.conditionѧϰ1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService
{
	private Lock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	public void await()
	{
		try
		{
			condition.await();//��wait����һ��������÷ŵ�ͬ��������в���
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
