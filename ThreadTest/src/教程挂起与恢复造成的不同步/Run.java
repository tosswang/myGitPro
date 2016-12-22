package 教程挂起与恢复造成的不同步;

public class Run
{

	public static void main(String[] args)throws Exception
	{
		final MyObject myObject=new MyObject();
		Thread thread1=new Thread(){public void run() {
			myObject.setValue("a", "aa");
		};};
		
		thread1.setName("a");
		thread1.start();
		Thread.sleep(500);
		Thread thread2=new Thread(){public void run() {
			myObject.printUserNamePassword();;
		};};
		thread2.start();
	}

}
