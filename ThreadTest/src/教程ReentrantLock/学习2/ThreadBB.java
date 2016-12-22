package ½Ì³ÌReentrantLock.Ñ§Ï°2;

public class ThreadBB extends Thread
{
	private MyService myService;
	public ThreadBB(MyService myService)
	{
		this.myService=myService;
	}
	@Override
	public void run()
	{
		myService.methodB();
	}
}
