package ���л�ѧϰ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SimpleSerial
{
	public static void main(String[] args) throws Exception {  
	       File file = new File("e:\\person.out");  

	       ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));  
	       Person person = new Person("John", 101, Gender.MALE);  
	       /**�鿴ObjectOutputStream 1143�д��룬
	        * ������String�������飬��Enum����Serializable��
	        * ��ô�Ϳ��ԶԸö���������л��������׳�NotSerializableException**/
	       oout.writeObject(person);  
	       oout.close();  
	 
	        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));  
	        Object newPerson = oin.readObject(); // û��ǿ��ת����Person����  
	        oin.close();  
	        System.out.println(newPerson);  
	    }  
}
