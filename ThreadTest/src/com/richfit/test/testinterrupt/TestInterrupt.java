package com.richfit.test.testinterrupt;

import java.util.concurrent.TimeUnit;

public class TestInterrupt {
	
	 class InnerInterrupt
	 {
		 public void set(String str)
		 {
			 int i=0;
			 i=i+1;
			 System.out.println(str+"i 目前的值是："+i);
		 }
	 }
	
	 public static void main(String[] str)
	 {
		 TestInterrupt ti=new TestInterrupt();
		 final InnerInterrupt test=ti.new InnerInterrupt();
		 Thread refT1 = new Thread(new Runnable() {
	         @Override
	         public void run() {
	                 try {
	                     TimeUnit.SECONDS.sleep(10);
	                	 System.out.println("Thread-one is running");
	                	 test.set("线程一在运行");
	                	 System.out.println("Thread-one 重新开始运行了");
	                	 
	                 } catch (Exception e) {
	                 }
	              
	         }
	 });

	 Thread refT2 = new Thread(new Runnable() {
	         @Override
	         public void run() {
	        	 try {					
	        		 TimeUnit.SECONDS.sleep(10);
	        		 System.out.println("Thread-two is running");
	        		 test.set("线程二在运行");
	        		 System.out.println("Thread-two 重新开始运行了");
				} catch (Exception e) {
					
				}
	         }
	 });
	 
	 
	 refT1.start();
	 refT2.start();
	 try
	 {
		 refT1.join();//明白了为什么这里加join了，因为存在可能，主线程，运行完stat()后，就可能结束流程了，这时子线程可能还没来的急run呢，所以这里必须join，让主线程等着
		 refT2.join();
	 }
	 catch(Exception e)
	 {
		 
	 }
	 
 }
 
}	
