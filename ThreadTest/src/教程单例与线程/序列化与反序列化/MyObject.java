package 教程单例与线程.序列化与反序列化;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 *  调用get方法时实例才能被创建，常见的实现方法就是在get方法中进行new实例化，不急迫
 * **/
public class MyObject implements Serializable
{
	private static final long serialVersionUID=888L;
	
	private static class MyObjectHandler
	{
		private static MyObject  myObject=new MyObject();
	}
	private MyObject()
	{		
	}
	
	public static MyObject getInstance()
	{			
		return 	MyObjectHandler.myObject;
	}
	protected Object readResolve() throws ObjectStreamException
	{
		System.out.println("调用了	readResolve 方法");
		return MyObjectHandler.myObject;
	}
}
