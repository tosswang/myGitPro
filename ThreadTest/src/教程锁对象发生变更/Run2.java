package �̳������������;

public class Run2
{

	public static void main(String[] args)
	{
		MyService service=new MyService();
		ThreadA a=new ThreadA(service);
		a.setName("A");
		ThreadB b=new ThreadB (service);
		b.setName("B");
		/**a��bһ��ʼ���У�ͬʱ������123�����Ҳ��һ�������Ӳ�̫�ã��Ҿ����г������½��
		 * A begin 1477557190812
			B begin 1477557190813
			A end 1477557191813
			B end 1477557191813
		 * ***/
		a.start();
	    b.start();

	}

}
