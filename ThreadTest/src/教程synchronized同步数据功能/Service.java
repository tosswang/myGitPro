package �̳�synchronizedͬ�����ݹ���;

public class Service
{
	private boolean isCountinueRun=true;
	public void runMethod()
	{
		while(isCountinueRun)
		{
			System.out.println("��������");
		}
		System.out.println("ͣ����");
	}
	
	public void stopMethod()
	{
		 isCountinueRun=false;
	}
}
