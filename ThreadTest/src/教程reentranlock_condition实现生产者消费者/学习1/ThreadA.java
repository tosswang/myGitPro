package 教程reentranlock_condition实现生产者消费者.学习1;



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
