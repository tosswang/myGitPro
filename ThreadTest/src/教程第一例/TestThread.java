package �̵̳�һ��;

public class TestThread
{
	public static void main(String[] str)
	{
		try
		{			
			MyThread threadA=new MyThread("A");
			MyThread threadB=new MyThread("B");
			MyThread threadC=new MyThread("C");
			MyThread threadD=new MyThread("D");
			threadA.start();
			threadB.start();
			threadC.start();
			threadD.start();
			System.out.println("�������������");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
