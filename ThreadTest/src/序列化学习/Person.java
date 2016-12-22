package ���л�ѧϰ;

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
		System.out.println("�޲ι��캯��");
	}

	public Person(String name, Integer age, Gender gender)
	{
		System.out.println("�вι��캯��");
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
	 * ���������ѱ�����Ϊtransitive���ֶ�age�����˽�transitive�ؼ���ȥ��֮�⣬�Ƿ�������������ʹ���ٴοɱ����л�,
	 * ����֮һ������Person�����������������writeObject()��readObject()
	 * **/
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		/**
		 * ���ȵ���ObjectOutputStream�е�defaultWriteObject()�������÷�����ִ��Ĭ�ϵ����л����ƣ���ʱ����Ե�age�ֶ�
		 * Ȼ���ٵ���writeInt()������ʾ�ؽ�age�ֶ�д�뵽ObjectOutputStream��
		 * 
		 * �÷�������ObjectOutputStream��writeObject�����з�����ã���1150��Դ�룬writeOrdinaryObject��Ӧ�Ĵ���
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
