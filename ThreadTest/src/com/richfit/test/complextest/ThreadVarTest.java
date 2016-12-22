package com.richfit.test.complextest;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadVarTest {
	private final ReentrantLock lock= new ReentrantLock(true);
	private EntityObject enty=new EntityObject();
	
	public void setName(String name)
	{
		final ReentrantLock lock = this.lock;
		System.out.println(lock);
        lock.lock();
        try {
        	enty.setName(name);           
        } finally {
            lock.unlock();
        }
	}
	
	public String getName()
	{
		final ReentrantLock lock = this.lock;
		System.out.println(lock);
        lock.lock();
        try {
        	return enty.getName();           
        } finally {
            lock.unlock();
        }
	}
	
	public static void main(String[] str)
	{
		ThreadVarTest tvt=new ThreadVarTest();
		ThreadOne one=new ThreadOne(tvt);
		ThreadTwo two=new ThreadTwo(tvt);
		
		one.start();
		two.start();
		try {			
			one.join();
			two.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class EntityObject
{
	private   String name="ABC";

	public String getName() {
		return name;
	}
	
	public void setName(String xName)
	{
		name=xName;
	}
	
}

class  ThreadOne extends Thread
{
	ThreadVarTest test;
	public ThreadOne(ThreadVarTest test)
	{
		this.test=test;
	}
	
	@Override
	public void run() {
		test.getName();
	}
	
}

class  ThreadTwo extends Thread
{
	ThreadVarTest test;
	public  ThreadTwo(ThreadVarTest test)
	{
		this.test=test;
	}
	@Override
	public void run() {
		test.setName("CDC");
	}
	
}
