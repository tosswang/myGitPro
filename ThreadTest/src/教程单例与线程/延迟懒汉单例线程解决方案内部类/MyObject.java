package �̵̳������߳�.�ӳ����������߳̽�������ڲ���;

/**
 *  ����get����ʱʵ�����ܱ�������������ʵ�ַ���������get�����н���newʵ������������
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
	/***ֻͬ����Ҫ�Ĵ��룬�������Ч��**/
	public static MyObject getInstance()
	{			
		return 	MyObjectHandler.myObject;
	}
}
