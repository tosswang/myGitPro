package �̶̳����������;

public class ThreadA extends Thread
{

	private HasSelfPrivateNum numRef;

	public ThreadA(HasSelfPrivateNum numRef)
	{
		this.numRef=numRef;
	}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		super.run();
		numRef.addI("a");
	}
}
