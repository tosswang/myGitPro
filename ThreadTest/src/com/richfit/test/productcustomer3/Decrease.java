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
				//���˯��0~500����
				//sleep�����ĵ��ã������ͷŶ���t����
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
