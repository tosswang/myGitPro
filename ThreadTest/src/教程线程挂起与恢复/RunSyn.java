package �̳��̹߳�����ָ�;

public class RunSyn
{

	public static void main(String[] args)
	{
		try
		{
			final SynchronizedObject  object=new SynchronizedObject();
			Thread thread1=new Thread(){
				
				@Override
				public void run()
				{
					object.printString();
				}
			};
			
			thread1.setName("a");
			thread1.start();
			Thread.sleep(1000);
			
			Thread thread2=new Thread(){
				
				@Override
				public void run()
				{
					
					System.out.println("thread2 �����ˣ������벻��printString������ֻ��ӡ��һ��begin");
					System.out.println("��ΪprintString������a�߳���������Զsuspend��");
					object.printString();
				}
			};
			
			thread2.start();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}

	}

}
