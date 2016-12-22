package 教程线程退出;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		
		try
		{			
			for(int i=0;i<500000;i++)
			{
				if(this.isInterrupted())
				{
					System.out.println("已经是停止状态，我要退出");
					throw new InterruptedException();
				}
				System.out.println("i="+(i+1));
			}
		}
		catch (Exception e)
		{
				System.out.println("中断了");
		}
	}
}
