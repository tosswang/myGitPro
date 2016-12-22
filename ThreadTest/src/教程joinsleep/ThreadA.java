package �̳�joinsleep;



public class ThreadA extends Thread
{
	private ThreadB b;
	public ThreadA(ThreadB b)
	{
		this.b=b;
	}

	@Override
	public void run()
	{
		try
		{
			synchronized(b)
			{
				b.start();
				/***������ӷǳ��õ�ڹ���ˣ�A�̵߳���B�̵߳�join�����󣬻ᱻwait��b����ĵȴ������У�
				 * ͬʱ�ͷŶ�b���е����������߳̾Ϳ���ִ��b�����synchronize������***/
				b.join();
				System.out.println("A�߳��ͷ���b��");
				//Thread.sleep(6000);
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
