package �̵̳������߳�.���л��뷴���л�;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 *  ����get����ʱʵ�����ܱ�������������ʵ�ַ���������get�����н���newʵ������������
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
		System.out.println("������	readResolve ����");
		return MyObjectHandler.myObject;
	}
}
