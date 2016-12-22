package 教程单例与线程.序列化与反序列化;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(MyObject.getInstance().hashCode());
	}
}
