package 教程线程组.学习1;

public class ThreadA extends Thread
{
	@Override
	public void run()
	{
		while(!Thread.currentThread().isInterrupted())
		{
			System.out.println("当前线程"+Thread.currentThread().getName());
			try
			{				
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
			}
		}
	}
}
