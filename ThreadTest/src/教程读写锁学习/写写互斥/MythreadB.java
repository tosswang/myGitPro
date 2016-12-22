package ½Ì³Ì¶ÁÐ´ËøÑ§Ï°.Ð´Ð´»¥³â;

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
		service.write();
	}
}
