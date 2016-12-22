package 教程锁对象发生变更;

public class MyService
{
	private String lock="123";
	public void testMethod()
	{
		try
		{
			synchronized (lock)
			{
				System.out.println(Thread.currentThread().getName()+" begin "+System.currentTimeMillis());
				lock="456";
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
