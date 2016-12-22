package ½Ì³Ì¶ÁÐ´ËøÑ§Ï°.Ð´Ð´»¥³â;

public class Run1
{
	public static void main(String[] args)
	{
		
		Service service=new Service();
		MythreadA threadA=new  MythreadA(service);
		threadA.setName("A");
		threadA.start();
		
		MythreadB threadB=new  MythreadB(service);
		threadB.setName("B");
		threadB.start();
	}
}
