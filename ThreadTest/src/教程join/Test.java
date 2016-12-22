package 教程join;

public class Test
{
	public static void main(String[] args)
	{
		try
		{
			MyThread  	thread=new MyThread();
			thread.start();
			/**对join的理解，一个线程A调用另一个线程B的join方法，join方法源码可知是一个synchronized方法，里面有wait语句，这就是说A会被阻塞掉，
			 * 即进入B对象的等待序列直到被唤醒才能继续执行操作，这也就解释了为什么调用了join后，必须等到B执行完后，A才能执行，因为很巧妙，A被阻塞
			 * 到了B的等待队列中去了，相当于挂起了，没人被唤醒的话，它是没办法继续执行的。什么时候唤醒呢，只要线程B执行完毕后，系统会自动唤醒A线程**/
			//thread.join();
			thread.join(2000);
			System.out.println(" main后执行 ");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
