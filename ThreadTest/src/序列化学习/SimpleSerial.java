package 序列化学习;

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
	       /**查看ObjectOutputStream 1143行代码，
	        * 类型是String，或数组，或Enum，或Serializable，
	        * 那么就可以对该对象进行序列化，否则将抛出NotSerializableException**/
	       oout.writeObject(person);  
	       oout.close();  
	 
	        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));  
	        Object newPerson = oin.readObject(); // 没有强制转换到Person类型  
	        oin.close();  
	        System.out.println(newPerson);  
	    }  
}
