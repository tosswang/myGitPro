package 教程锁的集成;

public class Main
{
	public int i=10;
	
	synchronized public void operateIMainMethod()
	{
		try
		{
			i--;
			System.out.println("main print i="+i);
			Thread.sleep(100);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
