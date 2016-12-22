package 教程线程停止;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		super.run();
		for(int i=0;i<80000;i++)
		{
			System.out.println("i="+(i+1));
		}
	}
}
