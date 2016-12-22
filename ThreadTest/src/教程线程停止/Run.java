package 教程线程停止;

public class Run
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyThread thread=new MyThread();
		thread.start();
		try
		{			
			Thread.sleep(2000);
			thread.interrupt();//仅仅是在当前线程中打了一个停止标志，并不能让它停下来
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}

}
