package �̳��߳���.ѧϰ1;

public class Run
{
	public static void main(String[] args)
	{		
		ThreadA aRunnable=new ThreadA();
		ThreadB bRunnable=new ThreadB();
		
		ThreadGroup group=new ThreadGroup("�ߺ����߳���");
		
		Thread a=new Thread(group,aRunnable);
		Thread b=new Thread(group,bRunnable);
		
		a.start();
		b.start();
		
		System.out.println("����߳���Ϊ��"+group.activeCount());
		System.out.println("�߳��������Ϊ��"+group.getName());
	}
	
	
	
}
