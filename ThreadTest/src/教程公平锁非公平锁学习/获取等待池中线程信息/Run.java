package �̳̹�ƽ���ǹ�ƽ��ѧϰ.��ȡ�ȴ������߳���Ϣ;

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
