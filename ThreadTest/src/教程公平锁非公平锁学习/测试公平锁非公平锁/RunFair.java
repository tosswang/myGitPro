package 教程公平锁非公平锁学习.测试公平锁非公平锁;

public class RunFair
{
	public static void main(String[] args)
	{
		final Service service=new Service(true);
		Runnable runnable=new Runnable(){
			
			@Override
			public void run()
			{
				System.out.println("★线程"+Thread.currentThread().getName()+"运行了");
				service.serviceMethod();
			}
		};
		
		Thread[] threadArray=new Thread[3];
		for(int i=0;i<3;i++)
		{
			threadArray[i]=new Thread(runnable);
		}
		for(int i=0;i<3;i++)
		{
			threadArray[i].start();//先启动的线程一定能抢到锁
		}
	}
}
