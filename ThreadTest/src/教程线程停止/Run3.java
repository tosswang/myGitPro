package �̳��߳�ֹͣ;

public class Run3
{

	public static void main(String[] args)
	{
		Thread.currentThread().interrupt();
		/***Thread .interrupted() ִ�к������ж�״̬**/
		System.out.println("�Ƿ�ֹͣ1��= "+Thread .interrupted());
		System.out.println("�Ƿ�ֹͣ2��= "+Thread.interrupted());
		System.out.println("end");
	}

}
