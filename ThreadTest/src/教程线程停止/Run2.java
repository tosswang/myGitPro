package 教程线程停止;

public class Run2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyThread thread=new MyThread();
		thread.start();
		try
		{			
			Thread.sleep(1000);
			thread.interrupt();
			/**thread.interrupted(),测试当前线程是否已中断，这里的当前线程是调用语句
			 * thread.interrupted()的线程就是指main线程！！！！！不是thread线程
			 * **/
			System.out.println("是否停止1？= "+thread .interrupted());
			System.out.println("是否停止2？= "+thread.interrupted());
		}
		catch (Exception e)
		{
			System.out.println("main Catch");
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
