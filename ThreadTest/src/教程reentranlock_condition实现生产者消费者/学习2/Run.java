package 教程reentranlock_condition实现生产者消费者.学习2;

public class Run
{

	public static void main(String[] args)
	{
		MyService  service=new MyService();
		ThreadA[] a=new ThreadA[10];
		ThreadB[] b=new ThreadB[10];
		for(int i=0;i<5;i++)
		{
			a[i]=new ThreadA(service);
			b[i]=new ThreadB(service);
			a[i].start();
			b[i].start();
		}
	}

}
