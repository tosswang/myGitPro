package 教程出现异常锁自动释放;

public class ThreadA extends Thread
{
	private Service service;
	
	public ThreadA(Service service)
	{
		this.service=service;
	}
	
	@Override
	public void run()
	{
		service.testMethod();
	}
}
