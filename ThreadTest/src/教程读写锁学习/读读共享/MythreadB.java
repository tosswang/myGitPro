package 教程读写锁学习.读读共享;

public class MythreadB extends Thread
{
	private Service service;
	
	public MythreadB(Service service)
	{
		this.service=service;
	}
	
	@Override
	public void run()
	{
		service.read();
	}
}
