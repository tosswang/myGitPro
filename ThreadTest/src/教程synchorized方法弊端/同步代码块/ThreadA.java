package 教程synchorized方法弊端.同步代码块;

public class ThreadA extends Thread
{
	private ObjectService service;
	public ThreadA(ObjectService service)
	{
		this.service=service;
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		super.run();
		service.doLongTimeTask();
	}
}
