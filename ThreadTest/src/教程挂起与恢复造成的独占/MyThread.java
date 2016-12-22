package 教程挂起与恢复造成的独占;

public class MyThread extends Thread
{
	private long i=0;
	@Override
	public void run()
	{
		while(true)
		{
			i++;
			System.out.println(i);
		}
	}
}
