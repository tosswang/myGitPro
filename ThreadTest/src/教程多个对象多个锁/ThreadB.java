package 教程多个对象多个锁;

public class ThreadB extends Thread
{
	
	private HasSelfPrivateNum numRef;
	
	public ThreadB(HasSelfPrivateNum numRef)
	{
		this.numRef=numRef;
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		super.run();
		numRef.addI("b");
	}
}
