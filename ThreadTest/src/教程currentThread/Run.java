package �̳�currentThread;

public class Run
{

	public static void main(String[] args)
	{
		/*MyThread myThread=new MyThread();
		myThread.start();*/
		/**main���ø÷���ʱ�������ĵ�3�У����ʱ����Ϊû����ȷΪ���̸߳�һ�����֣�������ϵͳ�Զ�����һ��thread-0**/
		/*CountOperate  	c=new CountOperate();
		c.setName("A");
		c.start();*/
		
		CountOperate  	c=new CountOperate();
		Thread t1=new Thread(c);
		t1.setName("A");
		t1.start();
	}

}
