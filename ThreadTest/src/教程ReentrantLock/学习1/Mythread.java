package �̳�ReentrantLock.ѧϰ1;

public class Mythread extends Thread
{
	private MyService myService;
	public Mythread(MyService myService)
	{
		this.myService=myService;
	}
	@Override
	public void run()
	{
		myService.testMethod();
	}
}
