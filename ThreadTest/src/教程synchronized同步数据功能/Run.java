package �̳�synchronizedͬ�����ݹ���;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			Service service=new Service();
			ThreadA a=new ThreadA(service);
			a.start();
			Thread.sleep(500);
			ThreadB b=new ThreadB(service);
			b.start();
			System.out.println("�Ѿ�����ֹͣ����");
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
