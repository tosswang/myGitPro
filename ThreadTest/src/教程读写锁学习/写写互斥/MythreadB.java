package �̶̳�д��ѧϰ.дд����;

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
