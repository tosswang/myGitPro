package �̳�join����;

public class ThreadB extends Thread
{
	@Override
	synchronized public void run()
	{
		try
		{
			System.out.println("��ʼ����B�̣߳�"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("��������B�̣߳�"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
