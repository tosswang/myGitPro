package �̳�join����;



public class ThreadA extends Thread
{
	private ThreadB b;
	public ThreadA(ThreadB b)
	{
		this.b=b;
	}

	@Override
	public void run()
	{
		try
		{
			synchronized(b)
			{
				System.out.println("��ʼ����A�̣߳�"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
				Thread.sleep(1000);
				System.out.println("��������A�̣߳�"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
