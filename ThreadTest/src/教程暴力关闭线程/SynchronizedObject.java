package 教程暴力关闭线程;

public class SynchronizedObject
{
	private String userName="a";
	private String password="aa";
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	synchronized public  void printString(String userName,String password)
	{
		try
		{
			this.userName=userName;
			Thread.sleep(100000);
			this.password=password;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
