package 教程线程是否活着;

public class Run
{

	public static void main(String[] args)
	{
		MyThread	mythread=new MyThread();
		System.out.println("begin="+mythread.isAlive());
		mythread.start();/**只要start线程就处于活着的状态直到运行完成*/
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		System.out.println("end="+mythread.isAlive());
	}

}
