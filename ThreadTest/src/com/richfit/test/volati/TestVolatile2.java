package com.richfit.test.volati;

public class TestVolatile2 {
	
	public  int inc = 0;
	public volatile boolean flag=false;
	
	public void doSomething(){		
		while(!flag){
			inc++;
			System.out.println("inc的最后的值为："+inc);
		}
	}
	
	public void setValue()
	{
		System.out.println("inc的修改停止前的值为："+inc);
		flag=true;
	}
	
	public static void main(String[] str)throws Exception
	{
		TestVolatile2 test=new TestVolatile2();
		
		Thread one=new Thread( test.new TreadOne(test));
		Thread tow=new Thread( test.new TreadTow(test));
		
		one.start();
		tow.start();
		tow.sleep(5000);
	
	}
	
	class TreadOne implements Runnable 
	{
		TestVolatile2 test;
		
		public TreadOne(TestVolatile2 param)
		{
			test=param;
		}
		@Override
		public void run()
		 {
			 test.doSomething();
		 }
	}
	
	class TreadTow implements Runnable 
	{
		TestVolatile2 test;
		
		public TreadTow(TestVolatile2 param)
		{
			test=param;
		}
		@Override
		public void run()
		 {
			 test.setValue();
		 }
	}
}
