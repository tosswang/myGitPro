package �̳��߳�״̬.ѧϰ2;

public class Run1
{
	public static void main(String[] args)
	{
		try
		{
			MyThreadA t1=new MyThreadA();
			t1.setName("A");
			t1.start();
		
			MyThreadB t2=new MyThreadB();
			t2.setName("B");
			t2.start();
			/**�ȴ�synchronize���߳�״̬����block**/
			System.out.println("main������t2��״̬��"+t2.getState());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
