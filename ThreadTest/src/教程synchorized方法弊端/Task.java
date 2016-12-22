package 教程synchorized方法弊端;

public class Task
{
	private String getData1;
	private String getData2;
	
	public synchronized void doLongTimeTask()
	{
		try
		{
			System.out.println("beigin task");
			Thread.sleep(3000);
			getData1="长时间处理任务后从远程返回的值 1 thread name="+Thread.currentThread().getName();
			getData2="长时间处理任务后从远程返回的值 2 thread name="+Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("task end");
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
