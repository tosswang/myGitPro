package 教程synchronized同步数据功能;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			Service service=new Service();
			ThreadA a=new ThreadA(service);
			a.start();
			Thread.sleep(500);
			ThreadB b=new ThreadB(service);
			b.start();
			System.out.println("已经发起停止命令");
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
