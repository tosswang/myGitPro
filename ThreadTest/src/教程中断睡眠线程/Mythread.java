package �̳��ж�˯���߳�;

public class Mythread extends Thread
{
	@Override
	public void run()
	{		
		try
		{			
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("end");
		}
		catch (Exception e)
		{
				System.out.println("�ڳ�˯�б�ֹͣ"+this.isInterrupted());
		}
	}
}
