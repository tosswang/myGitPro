package 教程单例与线程.延迟懒汉单例线程解决方案;

/**
 *  调用get方法时实例才能被创建，常见的实现方法就是在get方法中进行new实例化，不急迫
 * **/
public class MyObject
{
	private static MyObject myObject;
	private MyObject()
	{		
	}
	/***这种方法解决懒汉单例效率低下，第一次还行，因为本身单例还不存在，那只能一个线程去创建，其他线程就得等着，创建了以后，再次进入的时候
	 * 还是同步方法的话，那就会较低效率了，大部分线程只能等着一个线程释放了锁他们才能获得单例
	 * **/
	/*synchronized public static MyObject getInstance()
	{
		if(myObject!=null)
		{			
		}
		else
		{
			try
			{				
				//模拟在创建对象之前做一些准备工作
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				// TODO: handle exception
			}
			myObject=new MyObject();
		}
			
		return myObject;
	}*/
	
	/***这种方法解决懒汉单例效率和上面区别不大效率差不多
	 * **/
	/*public static MyObject getInstance()
	{
		
		synchronized (MyObject.class)
		{			
			if(myObject!=null)
			{			
			}
			else
			{
				try
				{				
					//模拟在创建对象之前做一些准备工作
					Thread.sleep(3000);
				}
				catch (Exception e)
				{
					// TODO: handle exception
				}
				myObject=new MyObject();
			}
			
			return myObject;
		}
	}*/
	/***只同步必要的代码，可以提高效率，但是tmd又无法获得单一实例了**/
	public static MyObject getInstance()
	{			
			if(myObject!=null)
			{			
			}
			else
			{
				try
				{				
					//模拟在创建对象之前做一些准备工作
					Thread.sleep(3000);
				}
				catch (Exception e)
				{
					// TODO: handle exception
				}
				synchronized(MyObject.class)
				{					
					myObject=new MyObject();
				}
			}
			
			return myObject;
		
	}
}
