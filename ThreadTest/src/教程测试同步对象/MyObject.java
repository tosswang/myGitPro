package 教程测试同步对象;

public class MyObject
{
	synchronized public void speedPrintString()
	{
		System.out.println("speedPrintString getlocktime:"+System.currentTimeMillis()+" ThreadName:"+Thread.currentThread().getName());	
		System.out.println("---------------------------");
		System.out.println("speedPrintString realselock time:"+System.currentTimeMillis()+" ThreadName:"+Thread.currentThread().getName());
	}
}	
