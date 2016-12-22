package 教程公平锁非公平锁学习.获取等待池中线程信息;

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
			service.notifyMethod();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	
	}
}
