package �̳������������;

public class Run
{

	public static void main(String[] args)
	{
		MyService service=new MyService();
		ThreadA a=new ThreadA(service);
		a.setName("A");
		ThreadB b=new ThreadB (service);
		b.setName("B");
		/**aһ��ʼ�������123����Ȼ������;������Ϊ�ˡ�456������������˯���ˣ�Thread.sleep(50);����Ҫ��
		 * b��ʼ���У�bһ����������456��û�������߳��ã�����b��ʼ���У�Ȼ��bҲ˯����
		 * ����a���ˣ���ʱ�߳�a�õĻ���123����������a���Լ�������ִ�У�Ȼ��bҲ����
		 * b�õ���456����������bҲ���Լ�������ִ��
		 * ***/
		a.start();
		try
		{			
			Thread.sleep(50);
		}
		catch (Exception e)
		{
		}
	    b.start();
	}

}
