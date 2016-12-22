package com.richfit.test.syn.thead;

public class Sample {
	
	 public synchronized void increase(){
	     
		 System.out.println(Thread.currentThread().getName()+"thread enter increase");
		 
		 
	    } 
	  public synchronized void decrease(){
	     
		  System.out.println(Thread.currentThread().getName()+"thread enter decrease");
		  for(;;)
		  {
			  
		  }
	    }
	  
	  public void mulip()
	  {
		  System.out.println(Thread.currentThread().getName()+"thread enter mul");
	  }
	}
