package 教程synchronized同步数据功能;

public class ThreadA extends Thread
{
	private Service service;
	public ThreadA(Service service)
	{
		this.service=service;
	}
	public void run()
	{
		service.runMethod();
	}
}
