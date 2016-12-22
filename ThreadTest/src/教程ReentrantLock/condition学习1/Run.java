package ΩÃ≥ÃReentrantLock.condition—ßœ∞1;

public class Run
{

	public static void main(String[] args)
	{
		MyService  service=new MyService();
		ThreadA a=new ThreadA(service);
		a.start();
	}

}
