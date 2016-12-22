package 教程数据库交叉备份;

public class DBTools
{
	volatile private boolean prevIsA=false;
	synchronized public void backupA()
	{
		try
		{
			while(prevIsA==true)
			{
				wait();
			}
			for(int i=0;i<5;i++)
			{
				System.out.println("★★★★★");
			}
			prevIsA=true;
			notifyAll();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
	synchronized public void backupB()
	{
		try
		{
			while(prevIsA==false)
			{
				wait();
			}
			for(int i=0;i<5;i++)
			{
				System.out.println("☆☆☆☆☆");
			}
			prevIsA=false;
			notifyAll();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
}
