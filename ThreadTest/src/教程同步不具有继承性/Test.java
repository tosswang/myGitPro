package �̳�ͬ�������м̳���;



public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Sub subRef=new Sub();
		MyThreadA a=new MyThreadA(subRef);
		a.setName("A");
		a.start();
		MyThreadB b=new MyThreadB(subRef);
		b.setName("B");
		b.start();
		
	}

}
