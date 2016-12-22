package 教程join意外;



public class ThreadA extends Thread
{
	private ThreadB b;
	public ThreadA(ThreadB b)
	{
		this.b=b;
	}

	@Override
	public void run()
	{
		try
		{
			synchronized(b)
			{
				System.out.println("开始运行A线程："+Thread.currentThread().getName()+" "+System.currentTimeMillis());
				Thread.sleep(1000);
				System.out.println("结束运行A线程："+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
