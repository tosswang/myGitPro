package �̵̳������߳�.�ӳ����������߳̽������˫�ؼ��;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(MyObject.getInstance().hashCode());
	}
}
