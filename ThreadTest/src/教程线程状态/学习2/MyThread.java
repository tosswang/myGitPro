package �̳��߳�״̬.ѧϰ2;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("��ʼ ˯��");
		try
		{			
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
		}
		System.out.println("���� ˯��");
	}
}
