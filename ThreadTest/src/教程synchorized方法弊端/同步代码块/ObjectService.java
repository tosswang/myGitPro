package �̳�synchorized�����׶�.ͬ�������;

public class ObjectService
{
	public  void doLongTimeTask()
	{
		try
		{
			synchronized(this){				
				System.out.println("beigin time="+System.currentTimeMillis());
				Thread.sleep(3000);
				System.out.println("end time="+System.currentTimeMillis());
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
