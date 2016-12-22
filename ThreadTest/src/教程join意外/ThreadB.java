package 教程join意外;

public class ThreadB extends Thread
{
	@Override
	synchronized public void run()
	{
		try
		{
			System.out.println("开始运行B线程："+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("结束运行B线程："+Thread.currentThread().getName()+" "+System.currentTimeMillis());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
