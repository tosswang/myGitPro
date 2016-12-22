package 教程joinsleep;



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
				b.start();
				/***这个例子非常好的诠释了，A线程调用B线程的join方法后，会被wait到b对象的等待队列中，
				 * 同时释放对b持有的锁，其他线程就可以执行b对象的synchronize方法了***/
				b.join();
				System.out.println("A线程释放了b锁");
				//Thread.sleep(6000);
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
