package 教程第一例;

import java.util.Random;
import java.util.Timer;

public class MyThread extends Thread
{
	private int count=5;
	
	public MyThread(String name)
	{
		this.setName(name);
	}
	
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
