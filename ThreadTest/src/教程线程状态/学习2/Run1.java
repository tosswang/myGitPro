package 教程线程状态.学习2;

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
			/**等待synchronize的线程状态就是block**/
			System.out.println("main方法中t2的状态："+t2.getState());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
