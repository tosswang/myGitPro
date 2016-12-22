package 教程.非线程安全实例;

public class Run
{

	public static void main(String[] args)
	{
		ALogin a=new ALogin();
		a.start();
		BLogin b=new BLogin();
		b.start();
	}

}
