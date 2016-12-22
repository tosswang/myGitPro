package 教程currentThread;

public class MyThread extends Thread
{
	public MyThread()
	{
		System.out.println("构造方法的调用人："+Thread.currentThread().getName());
	}
	
	@Override
	public void run()
	{
		System.out.println("run方法的调用人："+Thread.currentThread().getName());
	}
}
