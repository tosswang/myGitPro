package ½Ì³Ìjoin;

public class MyThread extends Thread
{
	 @Override
	public void run()
	{
		try
		{
			int secondValue=(int)(Math.random()*10000);
			System.out.println(secondValue);
			Thread.sleep(secondValue);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
