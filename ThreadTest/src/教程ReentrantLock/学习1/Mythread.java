package ½Ì³ÌReentrantLock.Ñ§Ï°1;

public class Mythread extends Thread
{
	private MyService myService;
	public Mythread(MyService myService)
	{
		this.myService=myService;
	}
	@Override
	public void run()
	{
		myService.testMethod();
	}
}
