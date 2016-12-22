package 教程锁的集成;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		Sub sub=new Sub();
		sub.operateISubMethod();
	}
}
