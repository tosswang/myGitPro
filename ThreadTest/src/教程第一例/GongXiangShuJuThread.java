package �̵̳�һ��;

public class GongXiangShuJuThread extends Thread
{
	private int count=5;	
	
	
	@Override
	public void run()
	{
		try
		{
			while(count>0)
			{
				int time=(int)(Math.random());
				Thread.sleep(time);
				System.out.println("��"+Thread.currentThread().getName()+"����,count="+count);
				count--;
			}
		}
		catch (Exception  e)
		{
			e.printStackTrace();
		}
		
	}
}
