package 教程线程状态.学习2;

public class MyService
{
	synchronized static public void serviceMethod()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+"进入了业务方法");
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
