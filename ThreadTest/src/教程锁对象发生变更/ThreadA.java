package 教程锁对象发生变更;

public class ThreadA extends Thread
{
	private MyService service;
	public ThreadA( MyService service)
	{
		this.service=service;
	}
	@Override
	public void run()
	{
		service.testMethod();
	}
}
