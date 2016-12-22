package 教程生产者消费者假死测试;

public class C
{
	private String lock;
	public C(String lock)
	{
		this.lock=lock;
	}
	
	public void getValue()
	{
		try
		{
			synchronized(lock)
			{
				while(ValueObject.value.equals(""))
				{
					System.out.println("消费者 "+Thread.currentThread().getName()+"  WAITING ");
					lock.wait();
				}
				System.out.println("消费者 "+Thread.currentThread().getName()+" RUNNABLE");
				//String value=System.currentTimeMillis()+"_"+System.nanoTime();
				
				ValueObject.value="";
				lock.notify();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
