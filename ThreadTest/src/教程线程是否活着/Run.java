package �̳��߳��Ƿ����;

public class Run
{

	public static void main(String[] args)
	{
		MyThread	mythread=new MyThread();
		System.out.println("begin="+mythread.isAlive());
		mythread.start();/**ֻҪstart�߳̾ʹ��ڻ��ŵ�״ֱ̬���������*/
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		System.out.println("end="+mythread.isAlive());
	}

}
