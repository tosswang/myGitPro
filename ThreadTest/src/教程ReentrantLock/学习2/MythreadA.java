package �̳�ReentrantLock.ѧϰ2;

public class MythreadA extends Thread
{
	private MyService myService;
	public MythreadA(MyService myService)
	{
		this.myService=myService;
	}
	@Override
	public void run()
	{
		myService.methodA();
	}
}
