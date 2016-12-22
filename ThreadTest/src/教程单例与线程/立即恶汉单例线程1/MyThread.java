package 教程单例与线程.立即恶汉单例线程1;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(MyObject.getInstance().hashCode());
	}
}
