package 教程测试同步对象;

public class Run
{

	public static void main(String[] args)
	{
		MyService service=new MyService();
		MyObject  object=new MyObject();
		
		ThreadA threadA=new ThreadA(object,service);
		threadA.setName("A");
		threadA.start();
		try
		{			
			ThreadA.sleep(1000);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		ThreadB threadB=new ThreadB(object);
		threadB.setName("B");
		threadB.start();
	}

}
