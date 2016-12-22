package 教程reentranlock_condition实现生产者消费者.学习1;

public class Run
{

	public static void main(String[] args)
	{
		MyService  service=new MyService();
		ThreadA a=new ThreadA(service);
		a.start();
		ThreadB b=new ThreadB(service);
		b.start();
	}

}
