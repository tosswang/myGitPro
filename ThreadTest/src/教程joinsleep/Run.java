package �̳�joinsleep;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			ThreadB b=new ThreadB();
			ThreadA a=new ThreadA(b);
			a.start();
			Thread.sleep(1000);
			ThreadC c=new ThreadC(b);
			c.start();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
