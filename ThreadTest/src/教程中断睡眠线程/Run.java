package �̳��ж�˯���߳�;
import �̳��ж�˯���߳�.Mythread;
public class Run
{
	public static void main(String[] args)
	{
		
		Mythread thread=new Mythread();
		thread.start();
		try
		{			
			Thread.sleep(2000);
			/**��֤����sleepʱ������interrupt���̻߳�����쳣�������Σ���������ж�״̬��־**/
			thread.interrupt();
		}
		catch (Exception e)
		{
			System.out.println("main Catch");
			e.printStackTrace();
		}
		System.out.println("end");

	}
}
