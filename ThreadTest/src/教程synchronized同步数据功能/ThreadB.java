package �̳�synchronizedͬ�����ݹ���;

public class ThreadB extends Thread
{
	private Service service;
	public ThreadB(Service service)
	{
		this.service=service;
	}
	public void run()
	{
		service.stopMethod();;
	}
}
