package �̳̳����쳣���Զ��ͷ�;

public class ThreadB extends Thread
{
	private Service service;
	
	public ThreadB(Service service)
	{
		this.service=service;
	}
	
	@Override
	public void run()
	{
		service.testMethod();
	}
}
