package �̳���ͼ�����.ѧϰ4;

public class Run1
{
	public static void main(String[] args)
	{
		
		Service service=new Service();
		MythreadA thread=new  MythreadA(service);
		thread.start();
	}
}
