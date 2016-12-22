package 教程线程状态.学习2;

public class MyThreadB extends Thread
{
	@Override
	public void run()
	{
		MyService.serviceMethod();
	}
}
