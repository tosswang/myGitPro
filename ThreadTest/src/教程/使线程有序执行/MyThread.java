package 教程.使线程有序执行;

public class MyThread extends Thread
{
	private Object lock;
	private String showChar;
	private int showNumPosition;
	private int printCount=0;//统计打印了几个字母
	volatile private static int addNumber=1;
	public MyThread(Object object, String showChar, int showNumPosition)
	{
		super();
		this.lock = object;
		this.showChar = showChar;
		this.showNumPosition = showNumPosition;
	}
	
	@Override
	public void run()
	{
		try
		{
			synchronized (lock)
			{
				while(true)
				{
					if(addNumber%3==showNumPosition)
					{
						System.out.println("ThreadName="+Thread.currentThread().getName()+" runCount= "+addNumber+" "+showChar);
						lock.notifyAll();
						addNumber++;
						printCount++;
						if(printCount==3)
						{
							break;
						}
					}
					else
					{
						lock.wait();
					}
				}
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
}
