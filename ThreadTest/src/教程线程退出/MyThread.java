package �̳��߳��˳�;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		
		try
		{			
			for(int i=0;i<500000;i++)
			{
				if(this.isInterrupted())
				{
					System.out.println("�Ѿ���ֹͣ״̬����Ҫ�˳�");
					throw new InterruptedException();
				}
				System.out.println("i="+(i+1));
			}
		}
		catch (Exception e)
		{
				System.out.println("�ж���");
		}
	}
}
