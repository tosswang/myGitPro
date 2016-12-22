package 教程synchorized方法弊端.同步代码块;

public class ThreadB extends Thread
{
	private ObjectService service;
	public ThreadB(ObjectService service)
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
