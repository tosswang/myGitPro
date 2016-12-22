package 教程暴力关闭线程;

public class Run
{
	public static void main(String[] args)
	{
		try
		{
			SynchronizedObject object=new SynchronizedObject();
			Mythread thread=new Mythread(object);
			thread.start();
			Thread.sleep(500);
			thread.stop();/**stop会造成数据不一致，例如本例，所以被干掉了**/
			System.out.println(object.getUserName()+" "+object.getPassword());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
