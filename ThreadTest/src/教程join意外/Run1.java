package �̳�join����;



public class Run1
{
	public static void main(String[] args)
	{
		try
		{
			ThreadB b=new ThreadB();
			ThreadA a=new ThreadA(b);
			a.start();
			b.start();
			/***������������һ�������Ҳ����ΪҪ�����ԣ���ThreadB��run������Ϊsynchronize�ˣ���ThreadAִ����Ϻ󣬻��ͷ�b������ʱmain�̺߳�threadb�߳�
			 * Ҫ��b������Ϊʲô�������������Ϊmain�߳�ִ�е����b.joinԴ����ʵ����һ��synchronize��������threadb��run����Ҳ��synchronize�ģ����Զ��߻�
			 * ����������ThreadB�̳���Thread,����Thread�ķ�����ʵ����ThreadB�ķ�����������������synchronized��������������
			 * ��ʱ��main��Ӯ�ˣ���ʱ��ThreadB��Ӯ�ˣ�������
			 * **/
			b.join(1000);
			System.out.println("��������main�̣߳�"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
