package �̳��߳�״̬.ѧϰ2;

public class MyService
{
	synchronized static public void serviceMethod()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+"������ҵ�񷽷�");
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
