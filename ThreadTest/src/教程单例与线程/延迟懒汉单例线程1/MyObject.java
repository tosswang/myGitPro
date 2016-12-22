package 教程单例与线程.延迟懒汉单例线程1;

/**
 *  调用get方法时实例才能被创建，常见的实现方法就是在get方法中进行new实例化，不急迫
 * **/
public class MyObject
{
	private static MyObject myObject;
	private MyObject()
	{		
	}
	
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
			myObject=new MyObject();
		}
			
		return myObject;
	}
}
