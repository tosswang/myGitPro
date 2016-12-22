package 教程单例与线程.延迟懒汉单例线程解决方案双重检查;

/**
 *  调用get方法时实例才能被创建，常见的实现方法就是在get方法中进行new实例化，不急迫
 * **/
public class MyObject
{
	private volatile  static MyObject myObject;
	private MyObject()
	{		
	}
	
	/***只同步必要的代码，可以提高效率**/
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
					//双重检查
					if(myObject==null)
					{						
						myObject=new MyObject();
					}
				}
			}
			
			return myObject;
		
	}
}
