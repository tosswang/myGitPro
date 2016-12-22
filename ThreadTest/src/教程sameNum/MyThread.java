package 教程sameNum;

public class MyThread extends Thread
{
	private int count=5;	
	
	@Override
	public void run()
	{
		try
		{
			/**println是同步的，count--虽然放在它里面，其实执行还是在外面**/
			System.out.println("i="+(count--)+" threadName="+Thread.currentThread().getName());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
