package �̳�sameNum;

public class MyThread extends Thread
{
	private int count=5;	
	
	@Override
	public void run()
	{
		try
		{
			/**println��ͬ���ģ�count--��Ȼ���������棬��ʵִ�л���������**/
			System.out.println("i="+(count--)+" threadName="+Thread.currentThread().getName());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
