package 教程试图获得锁.实现condition的顺序;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run1
{
	volatile public static int nextPrintWho=1;
	private static ReentrantLock lock=new ReentrantLock();
	final private static Condition conditionA=lock.newCondition();
	final private static Condition conditionB=lock.newCondition();
	final private static Condition conditionC=lock.newCondition();
	public static void main(String[] args)
	{
		Thread threadA=new Thread(){
			public void run()
			{
				try
				{
					lock.lock();
					while(nextPrintWho!=1)
					{
						conditionA.await();
					}
					for(int i=0;i<3;i++)
					{
						System.out.println("ThreadA "+(i+1));
					}
					nextPrintWho=2;
					/**
					 * signalAll,如果没有线程被阻塞在等待队列，则该方法空跑不会有任何效果
					 * **/
					conditionB.signalAll();
				}
				catch (Exception e)
				{
					// TODO: handle exception
				}
				finally
				{
					lock.unlock();
				}
			}
		};
		
		Thread threadB=new Thread(){
			public void run()
			{
				try
				{
					lock.lock();
					while(nextPrintWho!=2)
					{
						conditionB.await();
					}
					for(int i=0;i<3;i++)
					{
						System.out.println("ThreadB "+(i+1));
					}
					nextPrintWho=3;
					conditionC.signalAll();
				}
				catch (Exception e)
				{
					// TODO: handle exception
				}
				finally
				{
					lock.unlock();
				}
			}
		};
		
		Thread threadC=new Thread(){
			public void run()
			{
				try
				{
					lock.lock();
					while(nextPrintWho!=3)
					{
						conditionC.await();
					}
					for(int i=0;i<3;i++)
					{
						System.out.println("ThreadC "+(i+1));
					}
					nextPrintWho=1;
					conditionA.signalAll();
				}
				catch (Exception e)
				{
				}
				finally
				{
					lock.unlock();
				}
			}
		};
		
		Thread[] aArray=new Thread[2];
		Thread[] bArray=new Thread[2];
		Thread[] cArray=new Thread[2];
		
		for(int i=0;i<2;i++)
		{
			 aArray[i]=new Thread(threadA);
			 bArray[i]=new Thread(threadB);
			 cArray[i]=new Thread(threadC);
			 
			 aArray[i].start();
			 bArray[i].start();
			 cArray[i].start();
		}
	}

}

