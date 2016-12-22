package 教程线程状态.学习2;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			MyThread t=new MyThread();			
			t.start();
			Thread.sleep(1000);
			/**TIMED_WAITING,表明线程执行了Thread.sleep方法**/
			System.out.println("main方法中的状态："+t.getState());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
