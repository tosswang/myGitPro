package �̳̱����ر��߳�;

public class Mythread extends Thread
{
	private SynchronizedObject object;
	
	public Mythread(SynchronizedObject object)
	{
		this.object=object;
	}
	
	@Override
	public void run()
	{
		object.printString("b","bb");
	}
}
