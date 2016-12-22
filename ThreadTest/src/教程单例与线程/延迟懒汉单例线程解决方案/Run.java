package 教程单例与线程.延迟懒汉单例线程解决方案;

public class Run
{

	public static void main(String[] args)
	{
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
