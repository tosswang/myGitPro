package �̳�ThreadLocal�̸߳�����;

public class ThreadA extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Tools.t1.set("Aү"+(i+1));
				System.out.println("�߳�AүҪ�û��Լ���ֵ"+Tools.t1.get());
				Thread.sleep(200);
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
