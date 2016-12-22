package 教程synchorized方法弊端.同步代码块;

public class Run
{

	public static void main(String[] args)
	{
		ObjectService service=new ObjectService();
		ThreadA threadA=new ThreadA(service);
		threadA.setName("a");
		threadA.start();
		ThreadB threadB=new ThreadB(service);
		threadB.setName("b");		
		threadB.start();
	}

}
