package �̵̳������߳�.�����񺺵����߳�1;

public class MyObject
{
	/**��ģʽ���ڵ��÷���ǰ��ʵ���Ѿ��������ˣ�������������ֱ��newʵ����**/
	private static MyObject myObject=new MyObject();
	private MyObject()
	{		
	}
	
	public static MyObject getInstance()
	{
		return myObject;
	}
}
