package �̳��߳�ֹͣ;

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
					/***thread .isInterrupted() ִ�к󲻻�����ж�״̬**/
					System.out.println("�Ƿ�ֹͣ1��= "+thread .isInterrupted());
					System.out.println("�Ƿ�ֹͣ2��= "+thread.isInterrupted());
				}
				catch (Exception e)
				{
					System.out.println("main Catch");
					e.printStackTrace();
				}
				System.out.println("end");

	}

}
