package �̳�ThreadLocal�̸߳�����;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			ThreadA  a=new ThreadA();
			ThreadB b=new ThreadB();
			a.start();
			b.start();
			for(int i=0;i<5;i++)
			{
				Tools.t1.set("mainү"+(i+1));
				System.out.println("�߳�mainүҪ�û��Լ���ֵ"+Tools.t1.get());
				Thread.sleep(200);
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}

	}

}
