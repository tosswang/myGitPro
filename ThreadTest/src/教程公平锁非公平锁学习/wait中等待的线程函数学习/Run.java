package �̳̹�ƽ���ǹ�ƽ��ѧϰ.wait�еȴ����̺߳���ѧϰ;

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
		
		Thread[] threadArray=new Thread[5];
		for(int i=0;i<5;i++)
		{
			threadArray[i]=new Thread(runnable);
		}
		for(int i=0;i<5;i++)
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
		/**�ȴ���lock���̺߳���***/
		service.notifyMethod();
	}
}
