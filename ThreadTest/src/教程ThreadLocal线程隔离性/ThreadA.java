package 教程ThreadLocal线程隔离性;

public class ThreadA extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Tools.t1.set("A爷"+(i+1));
				System.out.println("线程A爷要拿回自己的值"+Tools.t1.get());
				Thread.sleep(200);
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
