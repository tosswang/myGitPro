package 教程synchronized同步数据功能;

public class ThreadB extends Thread
{
	private Service service;
	public ThreadB(Service service)
	{
		this.service=service;
	}
	public void run()
	{
		service.stopMethod();;
	}
}
