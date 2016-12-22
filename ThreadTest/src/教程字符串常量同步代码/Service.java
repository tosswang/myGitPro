package 教程字符串常量同步代码;

public class Service
{
	public static void print(String stringParam)
	{
		synchronized (stringParam)
		{
			while(true)
			{
				System.out.println(Thread.currentThread().getName());
				try
				{					
					Thread.sleep(1000);
				}
				catch (Exception e)
				{
				}
			}
		}
	}
}
