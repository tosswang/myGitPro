package �̳�join;

public class Test
{
	public static void main(String[] args)
	{
		try
		{
			MyThread  	thread=new MyThread();
			thread.start();
			/**��join����⣬һ���߳�A������һ���߳�B��join������join����Դ���֪��һ��synchronized������������wait��䣬�����˵A�ᱻ��������
			 * ������B����ĵȴ�����ֱ�������Ѳ��ܼ���ִ�в�������Ҳ�ͽ�����Ϊʲô������join�󣬱���ȵ�Bִ�����A����ִ�У���Ϊ�����A������
			 * ����B�ĵȴ�������ȥ�ˣ��൱�ڹ����ˣ�û�˱����ѵĻ�������û�취����ִ�еġ�ʲôʱ�����أ�ֻҪ�߳�Bִ����Ϻ�ϵͳ���Զ�����A�߳�**/
			//thread.join();
			thread.join(2000);
			System.out.println(" main��ִ�� ");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
