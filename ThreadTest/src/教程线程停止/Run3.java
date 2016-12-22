package 教程线程停止;

public class Run3
{

	public static void main(String[] args)
	{
		Thread.currentThread().interrupt();
		/***Thread .interrupted() 执行后会清除中断状态**/
		System.out.println("是否停止1？= "+Thread .interrupted());
		System.out.println("是否停止2？= "+Thread.interrupted());
		System.out.println("end");
	}

}
