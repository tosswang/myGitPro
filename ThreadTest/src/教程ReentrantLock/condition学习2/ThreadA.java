package �̳�ReentrantLock.conditionѧϰ2;



public class ThreadA extends Thread
{
	private  MyService  service;
	public ThreadA( MyService  service)
	{
		this.service=service;
	}

	@Override
	public void run()
	{
		service.awaitMethod();;
	}
}
