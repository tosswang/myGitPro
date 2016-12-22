package 教程currentThread;

public class Run
{

	public static void main(String[] args)
	{
		/*MyThread myThread=new MyThread();
		myThread.start();*/
		/**main调用该方法时，方法的第3行，这个时候因为没有明确为该线程赋一个名字，所以是系统自动赋了一个thread-0**/
		/*CountOperate  	c=new CountOperate();
		c.setName("A");
		c.start();*/
		
		CountOperate  	c=new CountOperate();
		Thread t1=new Thread(c);
		t1.setName("A");
		t1.start();
	}

}
