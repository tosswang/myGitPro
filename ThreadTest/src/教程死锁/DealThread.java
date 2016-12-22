package 教程死锁;

public class DealThread implements Runnable
{
	public String userName;
	public Object lock1 = new Object();
	public Object lock2 = new Object();

	public void setFlag(String userName)
	{
		this.userName = userName;
	}

	@Override
	public void run()
	{
		if (userName.equals("a"))
		{
			synchronized (lock1)
			{
				try
				{
					System.out.println("username=" + userName);
					Thread.sleep(3000);
				}
				catch (Exception e)
				{
					// TODO: handle exception
				}

				synchronized (lock2)
				{
					System.out.println("按 lock1->lock2代码顺序执行");
				}
			}

		}

		if (userName.equals("b"))
		{
			synchronized (lock2)
			{
				try
				{
					System.out.println("username=" + userName);
					Thread.sleep(3000);
				}
				catch (Exception e)
				{
					// TODO: handle exception
				}

				synchronized (lock1)
				{
					System.out.println("按 lock2->lock1代码顺序执行");
				}
			}
		}

	}
}
