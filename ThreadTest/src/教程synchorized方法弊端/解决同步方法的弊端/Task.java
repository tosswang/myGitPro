package �̳�synchorized�����׶�.���ͬ�������ı׶�;

public class Task
{
	private String getData1;
	private String getData2;
	
	public  void doLongTimeTask()
	{
		try
		{
			System.out.println("beigin task");
			Thread.sleep(3000);
			String privateGetData1="��ʱ�䴦��������Զ�̷��ص�ֵ 1 thread name="+Thread.currentThread().getName();
			String privateGetData2="��ʱ�䴦��������Զ�̷��ص�ֵ 2 thread name="+Thread.currentThread().getName();
			
			synchronized(this)
			{
				getData1=privateGetData1;
				getData2=privateGetData2;
			}
			
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
