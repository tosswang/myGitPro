package 教程挂起与恢复造成的独占;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			MyThread thread=new MyThread();
			thread.start();
			Thread.sleep(100);
			thread.suspend();
			System.out.println("main end!");
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
