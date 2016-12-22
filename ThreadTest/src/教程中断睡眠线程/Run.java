package 教程中断睡眠线程;
import 教程中断睡眠线程.Mythread;
public class Run
{
	public static void main(String[] args)
	{
		
		Mythread thread=new Mythread();
		thread.start();
		try
		{			
			Thread.sleep(2000);
			/**验证了在sleep时，调用interrupt，线程会进入异常捕获代码段，并且清除中断状态标志**/
			thread.interrupt();
		}
		catch (Exception e)
		{
			System.out.println("main Catch");
			e.printStackTrace();
		}
		System.out.println("end");

	}
}
