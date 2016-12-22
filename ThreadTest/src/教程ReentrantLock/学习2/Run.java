package ½Ì³ÌReentrantLock.Ñ§Ï°2;

public class Run
{

	public static void main(String[] args)
	{
		MyService myService=new MyService();
		MythreadA thread1=new MythreadA(myService);
		thread1.setName("A");
		thread1.start();
		MyThreadAA thread2=new MyThreadAA(myService);
		thread2.setName("AA");
		thread2.start();
		
		try
		{			
			Thread.sleep(100);
		}
		catch (Exception e)
		{
		}
		
		ThreadB thread3=new ThreadB(myService);
		thread3.setName("B");
		thread3.start();
		ThreadBB thread4=new ThreadBB(myService);
		thread4.setName("BB");
		thread4.start();
	}

}
