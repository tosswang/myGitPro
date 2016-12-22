package 教程线程状态.学习1;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			MyThread t=new MyThread();
			System.out.println("main方法中的状态1："+t.getState());
			Thread.sleep(1000);
			t.start();
			Thread.sleep(1000);
			System.out.println("main方法中的状态2："+t.getState());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
