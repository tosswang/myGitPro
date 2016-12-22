package 教程测试同步对象;

public class MyService
{
	public void testMethod(MyObject object)
	{
		synchronized (object)
		{
			try
			{
				System.out.println("testMothd getLockTime="+System.currentTimeMillis()+"   ThreadName:"+Thread.currentThread().getName());
				Thread.sleep(5000);
				System.out.println("testMothd releaseLockTime="+System.currentTimeMillis()+"   ThreadName:"+Thread.currentThread().getName());
			}
			catch (Exception e)
			{
				// TODO: handle exception
			}
		}
	}
}
