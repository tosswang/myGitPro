package �̳̳����쳣���Զ��ͷ�;

public class ThreadA extends Thread
{
	private Service service;
	
	public ThreadA(Service service)
	{
		this.service=service;
	}
	
	@Override
	public void run()
	{
		service.testMethod();
	}
}
