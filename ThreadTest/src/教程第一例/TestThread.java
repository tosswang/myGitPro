package 教程第一例;

public class TestThread
{
	public static void main(String[] str)
	{
		try
		{			
			MyThread threadA=new MyThread("A");
			MyThread threadB=new MyThread("B");
			MyThread threadC=new MyThread("C");
			MyThread threadD=new MyThread("D");
			threadA.start();
			threadB.start();
			threadC.start();
			threadD.start();
			System.out.println("主程序运行完毕");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
