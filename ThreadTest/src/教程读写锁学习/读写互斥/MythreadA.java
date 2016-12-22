package ½Ì³Ì¶ÁÐ´ËøÑ§Ï°.¶ÁÐ´»¥³â;

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
		service.read();
	}
}
