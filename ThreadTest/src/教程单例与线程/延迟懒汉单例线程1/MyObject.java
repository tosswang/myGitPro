package �̵̳������߳�.�ӳ����������߳�1;

/**
 *  ����get����ʱʵ�����ܱ�������������ʵ�ַ���������get�����н���newʵ������������
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
				//ģ���ڴ�������֮ǰ��һЩ׼������
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
