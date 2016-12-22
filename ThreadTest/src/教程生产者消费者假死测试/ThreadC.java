package 教程生产者消费者假死测试;

public class ThreadC extends Thread
{
	private C c;
	public ThreadC(C c)
	{
		this.c=c;
	}
	@Override
	public void run()
	{
		while(true)
		{
			c.getValue();
		}
	}
}
