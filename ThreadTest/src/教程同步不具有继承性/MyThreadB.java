package �̳�ͬ�������м̳���;

public class MyThreadB extends Thread
{
	private Sub sub;
	public MyThreadB(Sub sub)
	{
		// TODO Auto-generated constructor stub
		this.sub=sub;
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		sub.serviceMethod();
	}
}
