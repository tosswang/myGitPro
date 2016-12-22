package 教程synchorized方法弊端;

public class MyThread2 extends Thread
{
	private Task task1;
	public MyThread2(Task task1)
	{
		// TODO Auto-generated constructor stub
		this.task1=task1;
	}
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		super.run();
		CommonUtils.beginTime2=System.currentTimeMillis();
		task1.doLongTimeTask();
		CommonUtils.endTime2=System.currentTimeMillis();
	}
}
