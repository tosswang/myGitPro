package ΩÃ≥ÃReentrantLock.condition—ßœ∞3;

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
		service.signalAll();
	}

}
