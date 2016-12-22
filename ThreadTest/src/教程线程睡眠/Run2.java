package 教程线程睡眠;

public class Run2
{

	public static void main(String[] args)
	{
		MyThread2 myThread=new MyThread2();
		System.out.println(" begin ="+System.currentTimeMillis());
		myThread.start();
		System.out.println(" end ="+System.currentTimeMillis());
	}

}
