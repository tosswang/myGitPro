package 教程ReentrantLock.condition单独唤醒一个线程;

public class ThreadB extends Thread
{
	private  MyService  service;
	public ThreadB( MyService  service)
	{
		this.service=service;
	}

	@Override
	public void run()
	{
		service.awaitB();
	}
}
