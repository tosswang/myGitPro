package 教程.非线程安全实例;

public class BLogin extends Thread
{
	@Override
	public void run()
	{
		LoginServlet.doPost("b","bb");
	}
}
