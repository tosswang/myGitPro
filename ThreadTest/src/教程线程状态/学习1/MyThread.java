package �̳��߳�״̬.ѧϰ1;

public class MyThread extends Thread
{
	public MyThread()
	{
		System.out.println("���췽���е�״̬��"+Thread.currentThread().getName()+"::"+Thread.currentThread().getState());
	}
	
	@Override
	public void run()
	{
		System.out.println("run �����е�״̬��"+Thread.currentThread().getName()+"::"+Thread.currentThread().getState());
	}
}
