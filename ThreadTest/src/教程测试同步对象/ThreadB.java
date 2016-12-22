package 教程测试同步对象;

public class ThreadB extends Thread
{

	private MyObject object;
	
	public ThreadB(MyObject object)
	{
		// TODO Auto-generated constructor stub
		this.object=object;
		
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		super.run();
		object.speedPrintString();
	}
}
