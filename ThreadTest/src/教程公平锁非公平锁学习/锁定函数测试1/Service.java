package �̳̹�ƽ���ǹ�ƽ��ѧϰ.������������1;

import java.util.concurrent.locks.ReentrantLock;

public class Service
{
	private ReentrantLock lock=new ReentrantLock();

	public void serviceMethod1()
	{
		try
		{
			lock.lock();
			/**lock.getHoldCount() ����
			 * lock�ķ�������������ӳ�����߳���
			 * ���е���������������
			 * */
			System.out.println("serviceMethod1 getHoldCount="+lock.getHoldCount());
			serviceMethod2();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			lock.unlock();
			System.out.println("serviceMethod1 �ͷ���");
		}
	}
	
	public void serviceMethod2()
	{
		try
		{
			lock.lock();
			System.out.println("serviceMethod2 getHoldCount="+lock.getHoldCount());
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			System.out.println("serviceMethod2 �ͷ���");
			lock.unlock();
			/**������ôд�������⣬��һ�䶼unlock�ˣ��㻹��֮��������ͻ�������벻���Ľ��**/
			//System.out.println("serviceMethod2 �ͷ���");
		}
	}
}
