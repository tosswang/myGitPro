package �̵̳������߳�.�ӳ����������߳̽������˫�ؼ��;

/**
 *  ����get����ʱʵ�����ܱ�������������ʵ�ַ���������get�����н���newʵ������������
 * **/
public class MyObject
{
	private volatile  static MyObject myObject;
	private MyObject()
	{		
	}
	
	/***ֻͬ����Ҫ�Ĵ��룬�������Ч��**/
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
				synchronized(MyObject.class)
				{	
					//˫�ؼ��
					if(myObject==null)
					{						
						myObject=new MyObject();
					}
				}
			}
			
			return myObject;
		
	}
}
