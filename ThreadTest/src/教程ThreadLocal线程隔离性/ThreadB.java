package �̳�ThreadLocal�̸߳�����;

public class ThreadB extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Tools.t1.set("Bү"+(i+1));
				System.out.println("�߳�BүҪ�û��Լ���ֵ"+Tools.t1.get());
				Thread.sleep(200);
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
