package 教程挂起与恢复造成的不同步;

public class MyObject
{
	private String userName="1";
	private String password="11";
	public void setValue(String u,String p)
	{
		this.userName=u;
		if(Thread.currentThread().getName().equals("a"))
		{
			System.out.println("停止a线程");
			Thread.currentThread().suspend();
		}
		this.password=p;
	}
	
	public void printUserNamePassword()
	{
		System.out.println(userName+" "+password );
	}

}
