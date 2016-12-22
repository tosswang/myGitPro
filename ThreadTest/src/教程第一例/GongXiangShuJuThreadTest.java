package 教程第一例;

public class GongXiangShuJuThreadTest
{
	
	public static void main(String[] str)
	{		
		GongXiangShuJuThread threadA=new GongXiangShuJuThread();
		Thread a=new Thread(threadA,"A");
		Thread b=new Thread(threadA,"B");
		Thread c=new Thread(threadA,"C");
		try
		{
			/***看thread源码,它的run其实调用的是target下的run,也就是这3个线程调用的都是threadA的run方法**/
			a.start();
			b.start();
			c.start();
			System.out.println("主程序运行完毕");
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
	
}
