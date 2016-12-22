package com.richfit.test.productcustomer3;

public class Decrease extends Thread {
	private Target t;
	public Decrease(Target t)
	{
		this.t = t;
	}
	
	@Override
	public void run()
	{
		for(int i = 0 ; i < 30 ; i++)
		{
			try
			{
				//随机睡眠0~500毫秒
				//sleep方法的调用，不会释放对象t的锁
				Thread.sleep((long)(Math.random()*500));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			t.decrease();
			
		}
		
	}
}
