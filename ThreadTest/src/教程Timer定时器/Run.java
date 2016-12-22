package 教程Timer定时器;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run
{
	/**
	 * new Timer() 看源码可知启动了一个线程，线程start后自然会开始run，可以发现，
	 * run的时候会while(true)一段代码，这段代码里，会对变量queue进行锁定，如果为空
	 * 就把运行的线程阻塞到queue变量的等待队列中，并释放锁。
	 * 当执行Timer中的schedule方法时，会唤醒阻塞在queue变量的等待队列中的线程，他会继续执行
	 * 从queue中去得task，调用他的run方法进行执行。执行完后绩效在while(true)中循环，所以
	 * 虽然任务执行完了，但是还有线程没有死。
	 * **/
	private static Timer timer=new Timer();
	static public class MyTask extends TimerTask
	{
		@Override
		public void run()
		{
			System.out.println("运行了！时间为："+new Date());
		}
	}
	
	public static void main(String[] str)
	{
		try
		{
			MyTask myTask=new MyTask();
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			String dateString="2016-11-07 13:28:50";
			
			Date dataRef=sdf.parse(dateString);
			/**TimerThread源码第497行，taskFired = (executionTime<=currentTime)
			 * 是通过当前时间与执行时间比较，相等为true时，就会调用task中的run
			 * **/
			timer.schedule(myTask, dataRef);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
