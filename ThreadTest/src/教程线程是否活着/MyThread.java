package 教程线程是否活着;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("run="+this.isAlive());
	}
}
