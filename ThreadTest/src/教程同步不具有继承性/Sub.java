package �̳�ͬ�������м̳���;

public class Sub extends Main
{
	@Override
	 public void serviceMethod()
	{
		try
		{
			System.out.println("int sub ��һ�� sleep begin threadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub ��һ�� sleep end threadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
			super.serviceMethod();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
