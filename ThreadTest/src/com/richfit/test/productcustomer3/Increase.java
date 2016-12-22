package com.richfit.test.productcustomer3;

public class Increase extends Thread {
private Target t;
	
	public Increase(Target t)
	{
		this.t = t;
	}
	@Override
	public void run()
	{	
		for(int i = 0 ;i < 30; i++)
		{
			try
			{
				Thread.sleep((long)(Math.random()*500));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			t.increase();
		}
		
	}
}
