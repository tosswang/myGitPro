package 教程试图获得锁.学习3;

public class Run
{
	public static void main(String[] args)
	{
		//final Service service=new Service();
		Service1 service=new Service1();
		Mythread thread=new  Mythread(service);
		thread.start();
		try
		{			
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
		}
		thread.interrupt();
	}
}
