package �̳��߳�ֹͣ;

public class Run2
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
			/**thread.interrupted(),���Ե�ǰ�߳��Ƿ����жϣ�����ĵ�ǰ�߳��ǵ������
			 * thread.interrupted()���߳̾���ָmain�̣߳�������������thread�߳�
			 * **/
			System.out.println("�Ƿ�ֹͣ1��= "+thread .interrupted());
			System.out.println("�Ƿ�ֹͣ2��= "+thread.interrupted());
		}
		catch (Exception e)
		{
			System.out.println("main Catch");
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
