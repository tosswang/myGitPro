package 教程线程挂起与恢复;

public class RunSyn
{

	public static void main(String[] args)
	{
		try
		{
			final SynchronizedObject  object=new SynchronizedObject();
			Thread thread1=new Thread(){
				
				@Override
				public void run()
				{
					object.printString();
				}
			};
			
			thread1.setName("a");
			thread1.start();
			Thread.sleep(1000);
			
			Thread thread2=new Thread(){
				
				@Override
				public void run()
				{
					
					System.out.println("thread2 启动了，但进入不了printString方法，只打印了一个begin");
					System.out.println("因为printString方法被a线程锁定并永远suspend了");
					object.printString();
				}
			};
			
			thread2.start();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}

	}

}
