package �̵̳������߳�.���л��뷴���л�;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Run
{

	public static void main(String[] args)
	{		
		try
		{
			MyObject myObject=MyObject.getInstance();
			FileOutputStream fosRef=new FileOutputStream(new File("e:\\myObject.txt"));
			ObjectOutputStream oosRef=new ObjectOutputStream(fosRef);
			oosRef.writeObject(myObject);
			oosRef.close();
			fosRef.close();
			System.out.println(myObject.hashCode());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
		try
		{			
			FileInputStream fisRef=new FileInputStream(new File("e:\\myObject.txt"));
			ObjectInputStream iosRef=new ObjectInputStream(fisRef);
			/**
			 * ����I/O���ж�ȡ����ʱ��readResolve()�������ᱻ���õ���ʵ���Ͼ�����readResolve()�з��صĶ���
			 * ֱ���滻�ڷ����л������д����Ķ��󡣲μ�ObjectInputStream Դ���1760
			 * �ᷴ�����readResolve����
			 * **/
			MyObject myObject=(MyObject)iosRef.readObject();
			iosRef.close();
			fisRef.close();
			System.out.println(myObject.hashCode());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
