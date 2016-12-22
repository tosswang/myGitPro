package 教程ReentrantLock.condition学习1;

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
			condition.await();//和wait方法一样，必须得放到同步代码段中才行
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
