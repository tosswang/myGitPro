package 教程线程停止;

public class Run4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				MyThread thread=new MyThread();
				thread.start();
				try
				{			
					Thread.sleep(1000);
					thread.interrupt();
					/***thread .isInterrupted() 执行后不会清除中断状态**/
					System.out.println("是否停止1？= "+thread .isInterrupted());
					System.out.println("是否停止2？= "+thread.isInterrupted());
				}
				catch (Exception e)
				{
					System.out.println("main Catch");
					e.printStackTrace();
				}
				System.out.println("end");

	}

}
