package �̶̳�д��ѧϰ.дд����;

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
		service.write();
	}
}
