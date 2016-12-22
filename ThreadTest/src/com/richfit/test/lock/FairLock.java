package com.richfit.test.lock;

import java.util.ArrayList;
import java.util.List;

public class FairLock {
	private boolean isLocked= false; 
	  private Thread  lockingThread = null; 
	  private List<QueueObject> waitingThreads = new ArrayList<QueueObject>(); 
	  public void lock() throws InterruptedException
	  { 
		QueueObject queueObject= new QueueObject(); 
		boolean     isLockedForThisThread = true; 
		synchronized(this)
		{ 
	      waitingThreads.add(queueObject); 
		} 

	    while(isLockedForThisThread)
		{ 
			synchronized(this)
			{ 
				isLockedForThisThread = isLocked || waitingThreads.get(0) != queueObject; 
				if(!isLockedForThisThread)
				{ 
					isLocked = true; 
					waitingThreads.remove(queueObject); 
					lockingThread = Thread.currentThread(); 
					return; 
				} 
			}	 

			try
			{ 
				queueObject.doWait(); //把当前线程放到自己的等待池中，等待唤醒
			}
			catch(InterruptedException e)
			{ 
				synchronized(this) { waitingThreads.remove(queueObject); } 
				throw e; 
			}	 
	  } 
	} 

	public synchronized void unlock(){  //一旦获得锁，其他synchronized不在执行
	  if(this.lockingThread != Thread.currentThread())
	  { 
	    throw new IllegalMonitorStateException("Calling thread has not locked this lock"); 
	  } 
	  isLocked      = false; 
	  lockingThread = null; 
	  if(waitingThreads.size() > 0)
	  { 
	    waitingThreads.get(0).doNotify(); //这样做就保证了每次只唤醒一个线程，且只唤醒列表的头元素，实现了公平。
	  } 
	 
	} 
}
