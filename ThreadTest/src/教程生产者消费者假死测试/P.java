package 教程生产者消费者假死测试;

public class P
{
	private String lock;
	public P(String lock)
	{
		this.lock=lock;
	}
	
	public void setValue()
	{
		try
		{
			synchronized(lock)
			{
				while(!ValueObject.value.equals(""))
				{
					System.out.println("生产者 "+Thread.currentThread().getName()+"  WAITING ");
					lock.wait();
				}
				System.out.println("生产者 "+Thread.currentThread().getName()+" RUNNABLE");
				String value=System.currentTimeMillis()+"_"+System.nanoTime();
				
				ValueObject.value=value;
				lock.notify();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
