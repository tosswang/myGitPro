package �̳�currentThread;

public class MyThread extends Thread
{
	public MyThread()
	{
		System.out.println("���췽���ĵ����ˣ�"+Thread.currentThread().getName());
	}
	
	@Override
	public void run()
	{
		System.out.println("run�����ĵ����ˣ�"+Thread.currentThread().getName());
	}
}
