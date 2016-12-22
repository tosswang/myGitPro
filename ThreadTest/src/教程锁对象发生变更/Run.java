package 教程锁对象发生变更;

public class Run
{

	public static void main(String[] args)
	{
		MyService service=new MyService();
		ThreadA a=new ThreadA(service);
		a.setName("A");
		ThreadB b=new ThreadB (service);
		b.setName("B");
		/**a一开始获得锁“123”，然后运行途中锁改为了“456”，接着他就睡着了，Thread.sleep(50);很重要，
		 * b开始运行，b一拿锁发现是456，没有其他线程用，所以b开始运行，然后b也睡着了
		 * 接着a醒了，此时线程a拿的还是123的锁，所以a可以继续往下执行，然后，b也醒了
		 * b拿的是456的锁，所以b也可以继续往下执行
		 * ***/
		a.start();
		try
		{			
			Thread.sleep(50);
		}
		catch (Exception e)
		{
		}
	    b.start();
	}

}
