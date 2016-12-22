package 教程试图获得锁.学习4;

public class Run2
{

	public static void main(String[] args)
	{
		Service service=new Service();
		MythreadA threadA=new  MythreadA(service);
		threadA.start();
		try
		{
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		MythreadB threadB=new  MythreadB(service);
		threadB.start();
	}

}
