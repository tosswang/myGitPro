package 教程字符串常量同步代码;

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
		// TODO Auto-generated method stub
		super.run();
		service.print("AA");
	}
}
