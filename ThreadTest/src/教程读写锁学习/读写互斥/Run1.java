package �̶̳�д��ѧϰ.��д����;

public class Run1
{
	public static void main(String[] args)
	{
		
		Service service=new Service();
		
		MythreadB threadB=new  MythreadB(service);
		threadB.setName("B");
		threadB.start();
		
		MythreadA threadA=new  MythreadA(service);
		threadA.setName("A");
		threadA.start();
		
	}
}
