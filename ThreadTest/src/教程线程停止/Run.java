package �̳��߳�ֹͣ;

public class Run
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyThread thread=new MyThread();
		thread.start();
		try
		{			
			Thread.sleep(2000);
			thread.interrupt();//�������ڵ�ǰ�߳��д���һ��ֹͣ��־������������ͣ����
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}

}
