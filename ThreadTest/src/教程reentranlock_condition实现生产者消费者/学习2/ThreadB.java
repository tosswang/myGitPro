package 教程reentranlock_condition实现生产者消费者.学习2;

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
