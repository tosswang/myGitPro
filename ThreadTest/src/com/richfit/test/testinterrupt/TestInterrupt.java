package com.richfit.test.testinterrupt;

import java.util.concurrent.TimeUnit;

public class TestInterrupt {
	
	 class InnerInterrupt
	 {
		 public void set(String str)
		 {
			 int i=0;
			 i=i+1;
			 System.out.println(str+"i Ŀǰ��ֵ�ǣ�"+i);
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
	                	 test.set("�߳�һ������");
	                	 System.out.println("Thread-one ���¿�ʼ������");
	                	 
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
	        		 test.set("�̶߳�������");
	        		 System.out.println("Thread-two ���¿�ʼ������");
				} catch (Exception e) {
					
				}
	         }
	 });
	 
	 
	 refT1.start();
	 refT2.start();
	 try
	 {
		 refT1.join();//������Ϊʲô�����join�ˣ���Ϊ���ڿ��ܣ����̣߳�������stat()�󣬾Ϳ��ܽ��������ˣ���ʱ���߳̿��ܻ�û���ļ�run�أ������������join�������̵߳���
		 refT2.join();
	 }
	 catch(Exception e)
	 {
		 
	 }
	 
 }
 
}	
