package �̳�joinsleep;

public class ThreadB extends Thread
{
	@Override
	public void run()
	{
		try
		{
			System.out.println(" b�߳̿�ʼ����ʱ��: "+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(" b�߳̽�������ʱ��: "+System.currentTimeMillis());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
	synchronized public void bService()
	{
		System.out.println(" ��ӡ�� bService time: "+System.currentTimeMillis());
	}
}
