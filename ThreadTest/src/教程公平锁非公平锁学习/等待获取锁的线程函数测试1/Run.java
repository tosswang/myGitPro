package 教程公平锁非公平锁学习.等待获取锁的线程函数测试1;

public class Run
{
	public static void main(String[] args)
	{
		final Service service=new Service();
		Runnable runnable=new Runnable(){
			
			@Override
			public void run()
			{
				service.serviceMethod1();
			}
		};
		
		Thread[] threadArray=new Thread[3];
		for(int i=0;i<3;i++)
		{
			threadArray[i]=new Thread(runnable);
		}
		for(int i=0;i<3;i++)
		{
			threadArray[i].start();
		}
		
		try
		{
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		/**等待拿lock的线程函数***/
		System.out.println("有线程数："+service.lock.getQueueLength()+"在等待获取锁");
	
	}
}
