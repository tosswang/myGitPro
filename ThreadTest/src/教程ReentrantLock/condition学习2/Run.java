package ΩÃ≥ÃReentrantLock.condition—ßœ∞2;

public class Run
{

	public static void main(String[] args)
	{
		MyService  service=new MyService();
		ThreadA a=new ThreadA(service);
		a.start();
	}

}
