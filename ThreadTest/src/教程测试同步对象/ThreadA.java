package 教程测试同步对象;

public class ThreadA extends Thread
{
	private MyObject object;
	private MyService service;
	
	public ThreadA(MyObject object,MyService service)
	{
		// TODO Auto-generated constructor stub
		this.object=object;
		this.service=service;
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		super.run();
		service.testMethod(object);
	}
}
