package �̵̳������߳�.�ӳ����������߳̽������;

/**
 *  ����get����ʱʵ�����ܱ�������������ʵ�ַ���������get�����н���newʵ������������
 * **/
public class MyObject
{
	private static MyObject myObject;
	private MyObject()
	{		
	}
	/***���ַ��������������Ч�ʵ��£���һ�λ��У���Ϊ�������������ڣ���ֻ��һ���߳�ȥ�����������߳̾͵õ��ţ��������Ժ��ٴν����ʱ��
	 * ����ͬ�������Ļ����Ǿͻ�ϵ�Ч���ˣ��󲿷��߳�ֻ�ܵ���һ���߳��ͷ��������ǲ��ܻ�õ���
	 * **/
	/*synchronized public static MyObject getInstance()
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
	}*/
	
	/***���ַ��������������Ч�ʺ��������𲻴�Ч�ʲ��
	 * **/
	/*public static MyObject getInstance()
	{
		
		synchronized (MyObject.class)
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
	}*/
	/***ֻͬ����Ҫ�Ĵ��룬�������Ч�ʣ�����tmd���޷���õ�һʵ����**/
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
					myObject=new MyObject();
				}
			}
			
			return myObject;
		
	}
}
