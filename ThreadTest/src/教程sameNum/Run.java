package ½Ì³ÌsameNum;

public class Run
{

	public static void main(String[] args)
	{
		MyThread run=new MyThread();
		Thread t1=new Thread(run);
		Thread t2=new Thread(run);
		Thread t3=new Thread(run);
		Thread t4=new Thread(run);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
