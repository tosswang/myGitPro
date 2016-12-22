package ½Ì³ÌReentrantLock.Ñ§Ï°1;

public class Run
{

	public static void main(String[] args)
	{
		MyService myService=new MyService();
		Mythread thread1=new Mythread(myService);
		Mythread thread2=new Mythread(myService);
		Mythread thread3=new Mythread(myService);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
