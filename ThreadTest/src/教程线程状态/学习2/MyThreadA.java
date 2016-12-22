package 教程线程状态.学习2;

public class MyThreadA extends Thread
{
	@Override
	public void run()
	{
		MyService.serviceMethod();
	}
}
