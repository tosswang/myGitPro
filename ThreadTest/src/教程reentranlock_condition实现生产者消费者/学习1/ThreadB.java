package �̳�reentranlock_conditionʵ��������������.ѧϰ1;

public class ThreadB extends Thread
{
	private  MyService  service;
	public ThreadB( MyService  service)
	{
		this.service=service;
	}

	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{			
			service.get();
		}
	}
}
