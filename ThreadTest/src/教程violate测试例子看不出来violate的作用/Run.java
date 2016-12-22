package 教程violate测试例子看不出来violate的作用;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			RunThread thread=new RunThread();
			thread.start();
			Thread.sleep(100);
			thread.setRunning(false);
			System.out.println("已经赋值为false");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
