package 教程单例与线程.延迟懒汉单例线程解决方案内部类;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(MyObject.getInstance().hashCode());
	}
}
