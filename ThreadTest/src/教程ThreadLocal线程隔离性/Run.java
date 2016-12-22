package 教程ThreadLocal线程隔离性;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			ThreadA  a=new ThreadA();
			ThreadB b=new ThreadB();
			a.start();
			b.start();
			for(int i=0;i<5;i++)
			{
				Tools.t1.set("main爷"+(i+1));
				System.out.println("线程main爷要拿回自己的值"+Tools.t1.get());
				Thread.sleep(200);
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}

	}

}
