package �̵̳�һ��;

public class GongXiangShuJuThreadTest
{
	
	public static void main(String[] str)
	{		
		GongXiangShuJuThread threadA=new GongXiangShuJuThread();
		Thread a=new Thread(threadA,"A");
		Thread b=new Thread(threadA,"B");
		Thread c=new Thread(threadA,"C");
		try
		{
			/***��threadԴ��,����run��ʵ���õ���target�µ�run,Ҳ������3���̵߳��õĶ���threadA��run����**/
			a.start();
			b.start();
			c.start();
			System.out.println("�������������");
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
	
}
