package 教程单例与线程.立即恶汉单例线程1;

public class MyObject
{
	/**恶汉模式，在调用方法前，实例已经被创建了，常见方法就是直接new实例化**/
	private static MyObject myObject=new MyObject();
	private MyObject()
	{		
	}
	
	public static MyObject getInstance()
	{
		return myObject;
	}
}
