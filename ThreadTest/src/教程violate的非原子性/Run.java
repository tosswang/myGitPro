package �̳�violate�ķ�ԭ����;

public class Run
{

	public static void main(String[] args)
	{
		Mythread[]  myThreadArray=new Mythread[100];
		for(int i=0;i<100;i++)
		{
			myThreadArray[i]=new Mythread();
		}
		for(int i=0;i<100;i++)
		{
			myThreadArray[i].start();
		}
	}

}
