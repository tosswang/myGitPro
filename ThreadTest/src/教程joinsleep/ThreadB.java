package 教程joinsleep;

public class ThreadB extends Thread
{
	@Override
	public void run()
	{
		try
		{
			System.out.println(" b线程开始运行时间: "+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(" b线程结束运行时间: "+System.currentTimeMillis());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
	synchronized public void bService()
	{
		System.out.println(" 打印了 bService time: "+System.currentTimeMillis());
	}
}
