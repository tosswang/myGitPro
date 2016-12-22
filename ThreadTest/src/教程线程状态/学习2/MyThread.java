package 教程线程状态.学习2;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("开始 睡眠");
		try
		{			
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
		}
		System.out.println("结束 睡眠");
	}
}
