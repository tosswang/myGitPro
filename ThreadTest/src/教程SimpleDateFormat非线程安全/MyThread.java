package 教程SimpleDateFormat非线程安全;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread
{
	/**一般情况下，new 一个 MyThread，他就会有2个自己的变量sdf和dateString，本例，sdf是多个线程用的一个变量，dateString是各自的私有变量**/
	private SimpleDateFormat sdf;
	private String dateString;
	
	public MyThread(SimpleDateFormat sdf,String dateString)
	{
		this.sdf=sdf;
		this.dateString=dateString;
	}
	
	@Override
	public void run()
	{
		try
		{
			Date date=sdf.parse(dateString);
			String newDateString=sdf.format(date).toString();
			if(!newDateString.equals(dateString))
			{
				System.out.println("ThreadName="+this.getName()+" 报错了 日期字符串："+dateString+"转换成的日期为："+newDateString);
			}
				
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
}
