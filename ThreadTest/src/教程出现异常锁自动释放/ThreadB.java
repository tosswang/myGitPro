package 教程出现异常锁自动释放;

public class ThreadB extends Thread
{
	private Service service;
	
	public ThreadB(Service service)
	{
		this.service=service;
	}
	
	@Override
	public void run()
	{
		service.testMethod();
	}
}
