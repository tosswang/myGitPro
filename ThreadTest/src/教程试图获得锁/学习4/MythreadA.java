package 教程试图获得锁.学习4;

public class MythreadA extends Thread
{
	private Service service;
	
	public MythreadA(Service service)
	{
		this.service=service;
	}
	
	@Override
	public void run()
	{
		service.waitMethod();
	}
}
