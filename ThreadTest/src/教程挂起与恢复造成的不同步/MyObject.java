package �̳̹�����ָ���ɵĲ�ͬ��;

public class MyObject
{
	private String userName="1";
	private String password="11";
	public void setValue(String u,String p)
	{
		this.userName=u;
		if(Thread.currentThread().getName().equals("a"))
		{
			System.out.println("ֹͣa�߳�");
			Thread.currentThread().suspend();
		}
		this.password=p;
	}
	
	public void printUserNamePassword()
	{
		System.out.println(userName+" "+password );
	}

}
