package �̳�ͬ�������м̳���;

public class MyThreadA extends Thread
{
	private Sub sub;
	public MyThreadA(Sub sub)
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
