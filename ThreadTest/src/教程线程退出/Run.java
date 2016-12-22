package 教程线程退出;

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
			thread.interrupt();/**要想中断只能通过抛异常的方式处理！！！！**/
		}
		catch (Exception e)
		{
			System.out.println("main Catch");
			e.printStackTrace();
		}
		System.out.println("end");

	}
}
