package 教程锁对象发生变更;

public class ThreadB extends Thread
{
	private MyService service;
	public ThreadB( MyService service)
	{
		this.service=service;
	}
	@Override
	public void run()
	{
		service.testMethod();
	}
}
