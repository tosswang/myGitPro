package 教程线程组.学习1;

public class Run
{
	public static void main(String[] args)
	{		
		ThreadA aRunnable=new ThreadA();
		ThreadB bRunnable=new ThreadB();
		
		ThreadGroup group=new ThreadGroup("高宏研线程组");
		
		Thread a=new Thread(group,aRunnable);
		Thread b=new Thread(group,bRunnable);
		
		a.start();
		b.start();
		
		System.out.println("活动的线程数为："+group.activeCount());
		System.out.println("线程组的名称为："+group.getName());
	}
	
	
	
}
