package �̳�ReentrantLock.ѧϰ2;

public class MyThreadAA extends Thread
{
	private MyService myService;
	public MyThreadAA(MyService myService)
	{
		this.myService=myService;
	}
	@Override
	public void run()
	{
		myService.methodA();
	}
}
