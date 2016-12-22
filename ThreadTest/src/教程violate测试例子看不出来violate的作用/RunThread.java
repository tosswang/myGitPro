package 教程violate测试例子看不出来violate的作用;

public class RunThread extends Thread
{
	//volatile private boolean isRunning =true;

	private boolean isRunning =true;
	
	public boolean isRunning()
	{
		return isRunning;
	}

	public void setRunning(boolean isRunning)
	{
		this.isRunning = isRunning;
	}
	
	public void run()
	{
		System.out.println("进入Run");
		while(isRunning==true)
		{	
			System.out.println("小鞋不断,老子忍了");
		}
		System.out.println("线程被停止了");
	}
}
