package �̳������������߼�������;

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
					System.out.println("������ "+Thread.currentThread().getName()+"  WAITING ");
					lock.wait();
				}
				System.out.println("������ "+Thread.currentThread().getName()+" RUNNABLE");
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
