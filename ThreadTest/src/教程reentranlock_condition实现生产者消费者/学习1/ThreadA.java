package �̳�reentranlock_conditionʵ��������������.ѧϰ1;



public class ThreadA extends Thread
{
	private  MyService  service;
	public ThreadA( MyService  service)
	{
		this.service=service;
	}

	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{			
			service.set();
		}
	}
}
