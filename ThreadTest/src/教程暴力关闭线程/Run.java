package �̳̱����ر��߳�;

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
			thread.stop();/**stop��������ݲ�һ�£����籾�������Ա��ɵ���**/
			System.out.println(object.getUserName()+" "+object.getPassword());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
