package 教程单例与线程.序列化与反序列化;

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
			 * 当从I/O流中读取对象时，readResolve()方法都会被调用到。实际上就是用readResolve()中返回的对象
			 * 直接替换在反序列化过程中创建的对象。参见ObjectInputStream 源码第1760
			 * 会反射调用readResolve方法
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
