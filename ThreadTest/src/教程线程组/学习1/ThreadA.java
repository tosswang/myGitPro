package �̳��߳���.ѧϰ1;

public class ThreadA extends Thread
{
	@Override
	public void run()
	{
		while(!Thread.currentThread().isInterrupted())
		{
			System.out.println("��ǰ�߳�"+Thread.currentThread().getName());
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
