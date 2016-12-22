package 教程synchorized方法弊端.解决同步方法的弊端;

public class MyThread1 extends Thread
{
	private Task task1;
	public MyThread1(Task task1)
	{
		// TODO Auto-generated constructor stub
		this.task1=task1;
	}
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		super.run();
		CommonUtils.beginTime1=System.currentTimeMillis();
		task1.doLongTimeTask();
		CommonUtils.endTime1=System.currentTimeMillis();
	}
}
