package �̳̹�ƽ���ǹ�ƽ��ѧϰ.���Թ�ƽ���ǹ�ƽ��;

public class RunUnFair
{
	public static void main(String[] args)
	{
		final Service service=new Service(false);
		Runnable runnable=new Runnable(){
			
			@Override
			public void run()
			{
				System.out.println("���߳�"+Thread.currentThread().getName()+"������");
				service.serviceMethod();
			}
		};
		
		Thread[] threadArray=new Thread[3];
		for(int i=0;i<3;i++)
		{
			threadArray[i]=new Thread(runnable);
		}
		for(int i=0;i<3;i++)
		{
			threadArray[i].start();//���������̲߳�һ����������
		}
	}
}
