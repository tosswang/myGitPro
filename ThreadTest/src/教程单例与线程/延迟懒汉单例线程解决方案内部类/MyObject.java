package 教程单例与线程.延迟懒汉单例线程解决方案内部类;

/**
 *  调用get方法时实例才能被创建，常见的实现方法就是在get方法中进行new实例化，不急迫
 * **/
public class MyObject
{
	private static class MyObjectHandler
	{
		private static MyObject  myObject=new MyObject();
	}
	private MyObject()
	{
		
	}
	/***只同步必要的代码，可以提高效率**/
	public static MyObject getInstance()
	{			
		return 	MyObjectHandler.myObject;
	}
}
