package 教程生产者消费者假死测试;

public class ThreadP extends Thread
{
	private P p;
	public ThreadP(P p)
	{
		this.p=p;
	}
	@Override
	public void run()
	{
		while(true)
		{
			p.setValue();
		}
	}
}
