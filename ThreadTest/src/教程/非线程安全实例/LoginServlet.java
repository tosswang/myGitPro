package �̳�.���̰߳�ȫʵ��;

public class LoginServlet
{
	private static String userNameRef;
	private static String passwordRef;
	
	public static void doPost(String userName,String password)
	{
		try
		{			
			userNameRef=userName;
			System.out.println("~~~");
			if(userName.equals("a"))
			{
				Thread.sleep(500);/**���ִ��ʧ�ܻ��׳��쳣**/
			}
			passwordRef=password;
			System.out.println("userName="+userNameRef+" password="+passwordRef);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
			
	}
}
