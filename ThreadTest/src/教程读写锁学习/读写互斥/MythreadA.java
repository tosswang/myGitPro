package �̶̳�д��ѧϰ.��д����;

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
