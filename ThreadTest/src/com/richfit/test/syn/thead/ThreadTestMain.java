package com.richfit.test.syn.thead;

public class ThreadTestMain {
	
	 public static void main(String[] args) {
	        Sample sample = new Sample();
	        Thread t1 = new IncreaseThread(sample);
	        Thread t2 = new DecreaseThread(sample);
	        Thread t3 = new IncreaseThread(sample);
	        Thread t4 = new MultiplyThread(sample);
	        
	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();
	    }
}
