package 教程ReentrantLock.condition单独唤醒一个线程;

public class Run
{

	public static void main(String[] args)
	{
		MyService  service=new MyService();
		ThreadA a=new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b=new ThreadB(service);
		b.setName("B");
		b.start();
		try
		{			
			Thread.sleep(500);
		}
		catch (Exception e)
		{
		}
		service.signalAll_A();
	}

}
