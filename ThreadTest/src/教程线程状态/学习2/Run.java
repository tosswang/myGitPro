package �̳��߳�״̬.ѧϰ2;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			MyThread t=new MyThread();			
			t.start();
			Thread.sleep(1000);
			/**TIMED_WAITING,�����߳�ִ����Thread.sleep����**/
			System.out.println("main�����е�״̬��"+t.getState());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
