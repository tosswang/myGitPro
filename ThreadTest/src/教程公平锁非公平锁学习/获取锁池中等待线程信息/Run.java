package �̳̹�ƽ���ǹ�ƽ��ѧϰ.��ȡ�����еȴ��߳���Ϣ;

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
		/**hasQueuedThread �������������Ƿ��еȴ�����ָ���߳�**/
		System.out.println(service.lock.hasQueuedThread(threadA));
		System.out.println(service.lock.hasQueuedThread(threadB));
		System.out.println(service.lock.hasQueuedThreads());
	}
}
