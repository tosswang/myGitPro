package 教程试图获得锁.学习3;

public class Mythread extends Thread
{
	//private Service service;
	private Service1 service;
	public Mythread(Service1 service)
	{
		this.service=service;
	}
	
	@Override
	public void run()
	{
		service.testMethod();
	}
}
