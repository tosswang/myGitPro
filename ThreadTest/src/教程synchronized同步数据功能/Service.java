package 教程synchronized同步数据功能;

public class Service
{
	private boolean isCountinueRun=true;
	public void runMethod()
	{
		while(isCountinueRun)
		{
			System.out.println("老子认了");
		}
		System.out.println("停下来");
	}
	
	public void stopMethod()
	{
		 isCountinueRun=false;
	}
}
