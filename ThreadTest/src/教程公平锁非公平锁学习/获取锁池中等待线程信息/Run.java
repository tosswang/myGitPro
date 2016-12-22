package 教程公平锁非公平锁学习.获取锁池中等待线程信息;

public class Run
{
	public static void main(String[] args)
	{
		final Service service=new Service();
		Runnable runnable=new Runnable(){
			
			@Override
			public void run()
			{
				service.waitMethod();
			}
		};
		
		Thread threadA=new Thread(runnable);
		threadA.start();
		try
		{			
			Thread.sleep(500);
		}
		catch (Exception e)
		{
		}
		Thread threadB=new Thread(runnable);
		threadB.start();
		try
		{			
			Thread.sleep(500);
		}
		catch (Exception e)
		{
		}
		/**hasQueuedThread 测试在锁池中是否有等待锁的指定线程**/
		System.out.println(service.lock.hasQueuedThread(threadA));
		System.out.println(service.lock.hasQueuedThread(threadB));
		System.out.println(service.lock.hasQueuedThreads());
	}
}
