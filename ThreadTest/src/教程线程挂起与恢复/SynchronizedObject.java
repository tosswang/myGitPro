package 教程线程挂起与恢复;

public class SynchronizedObject
{
	
	synchronized public  void printString()
	{
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a"))
		{
			System.out.println("a 线程永远 suspend 了！");
			/**suspend和sleep一样，不会释放锁**/
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
