package 教程第一例;

public class GongXiangShuJuThread extends Thread
{
	private int count=5;	
	
	
	@Override
	public void run()
	{
		try
		{
			while(count>0)
			{
				int time=(int)(Math.random());
				Thread.sleep(time);
				System.out.println("由"+Thread.currentThread().getName()+"计算,count="+count);
				count--;
			}
		}
		catch (Exception  e)
		{
			e.printStackTrace();
		}
		
	}
}
