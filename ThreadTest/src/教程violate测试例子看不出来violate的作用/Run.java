package �̳�violate�������ӿ�������violate������;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			RunThread thread=new RunThread();
			thread.start();
			Thread.sleep(100);
			thread.setRunning(false);
			System.out.println("�Ѿ���ֵΪfalse");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
