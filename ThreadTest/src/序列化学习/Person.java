package 序列化学习;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable
{
	// private static final long serialVersionUID=889L;

	private String name = null;
	// private Integer age = null;
	transient private Integer age = null;
	private Gender gender = null;

	public Person()
	{
		System.out.println("无参构造函数");
	}

	public Person(String name, Integer age, Gender gender)
	{
		System.out.println("有参构造函数");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
	/**
	 * 对于上述已被声明为transitive的字段age，除了将transitive关键字去掉之外，是否还有其它方法能使它再次可被序列化,
	 * 方法之一就是在Person类中添加两个方法：writeObject()与readObject()
	 * **/
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		/**
		 * 会先调用ObjectOutputStream中的defaultWriteObject()方法，该方法会执行默认的序列化机制，此时会忽略掉age字段
		 * 然后再调用writeInt()方法显示地将age字段写入到ObjectOutputStream中
		 * 
		 * 该方法会在ObjectOutputStream的writeObject方法中反射调用，见1150行源码，writeOrdinaryObject对应的代码
		 * ***/
		out.defaultWriteObject();
		out.writeInt(age);
	}

	private void readObject(ObjectInputStream in) throws IOException,
			ClassNotFoundException
	{
		in.defaultReadObject();
		age = in.readInt();
	}

	@Override
	public String toString()
	{
		return "[" + name + ", " + age + ", " + gender + "]";
	}
}
