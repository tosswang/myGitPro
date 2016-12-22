package 教程试图获得锁.学习2;

public class Run
{
	public static void main(String[] args)
	{
		final Service service=new Service();
		Runnable runnable=new Runnable(){
			
			@Override
			public void run()
			{
				System.out.println(Thread.currentThread().getName()+"调用waiMethod方法时间"+System.currentTimeMillis());
				service.waitMethod();
			}
		};
		
		Thread[] threadArray=new Thread[2];
		for(int i=0;i<2;i++)
		{
			threadArray[i]=new Thread(runnable);
		}
		for(int i=0;i<2;i++)
		{
			threadArray[i].start();
		}
	}
}
