package 教程字符串常量同步代码;

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
		// TODO Auto-generated method stub
		super.run();
		service.print("AA");
	}
}
