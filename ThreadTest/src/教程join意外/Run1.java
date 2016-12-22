package 教程join意外;



public class Run1
{
	public static void main(String[] args)
	{
		try
		{
			ThreadB b=new ThreadB();
			ThreadA a=new ThreadA(b);
			a.start();
			b.start();
			/***这里的输出是有一个随机性也是因为要做测试，把ThreadB的run方法改为synchronize了，当ThreadA执行完毕后，会释放b锁，此时main线程和threadb线程
			 * 要抢b锁对象，为什么这里会争抢？因为main线程执行的语句b.join源码其实就是一个synchronize方法，而threadb的run方法也是synchronize的，所以二者会
			 * 发生争抢（ThreadB继承自Thread,所以Thread的方法其实就是ThreadB的方法，两个方法都是synchronized因而会产生争抢）
			 * 有时候main抢赢了，有时候ThreadB抢赢了，都正常
			 * **/
			b.join(1000);
			System.out.println("结束运行main线程："+Thread.currentThread().getName()+" "+System.currentTimeMillis());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
