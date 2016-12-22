package 教程中断睡眠线程;

public class Mythread extends Thread
{
	@Override
	public void run()
	{		
		try
		{			
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("end");
		}
		catch (Exception e)
		{
				System.out.println("在沉睡中被停止"+this.isInterrupted());
		}
	}
}
