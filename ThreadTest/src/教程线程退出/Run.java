package �̳��߳��˳�;

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
			thread.interrupt();/**Ҫ���ж�ֻ��ͨ�����쳣�ķ�ʽ����������**/
		}
		catch (Exception e)
		{
			System.out.println("main Catch");
			e.printStackTrace();
		}
		System.out.println("end");

	}
}
