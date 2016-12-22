package �̳�ThreadLocalʵ��.ʵ��1;

public class Test
{
	ThreadLocal<Long> longLocal = new ThreadLocal<Long>();

	ThreadLocal<String> stringLocal = new ThreadLocal<String>();

	public void set()
	{

		/**��Ҫע�⣺ThreadLocal��set�����ǰѵ�ǰ������Ϊmap�ļ�ֵ��
		 * �����keyֵ����longLocal��stringLocal
		 * ��set�����Ĳ�����Ϊvalue������
		 * �����Ǻ��߳����ΰ���һ������겻ɢ�ģ��ĸ��߳�ִ�������ǣ����Ǿ�ճ������һ���߳�
		 * �ڱ�����ÿһ���̵߳�threadLocals��������2��ThreadLocal����Ӧ��keyֵ���Ǳ���longLocal�ͱ���stringLocal
		 * **/
		longLocal.set(Thread.currentThread().getId());
		stringLocal.set(Thread.currentThread().getName());

	}

	public long getLong()
	{

		return longLocal.get();

	}

	public String getString()
	{

		return stringLocal.get();

	}

	public static void main(String[] args)
	{
		final Test test = new Test();
        test.set();
        System.out.println(test.getLong());
        System.out.println(test.getString());
        
        Thread thread1 = new Thread(){
            public void run() {
                test.set();
                System.out.println(test.getLong());
                System.out.println(test.getString());
            };
        };
        
        thread1.start();
        try
		{			
        	thread1.join();
		}
		catch (Exception e)
		{
		}
        
        System.out.println(test.getLong());
        System.out.println(test.getString());
        /**
         * *1.����2���̣߳���֤��ͨ��ThreadLocal�����ĸ����Ǵ洢��ÿ���߳��Լ���threadLocals�еģ�
         * *2.Ϊ��threadLocals������ThreadLocalMap�ļ�ֵΪThreadLocalʵ������Ϊÿ���߳��п����ж��threadLocal����
         * *3.�ڽ���get֮ǰ��������set������ᱨ��ָ���쳣�� �������get֮ǰ����Ҫ����set�����������ʵĻ���������дinitialValue()������
         * *���û����set�Ļ�������map�в��Ҳ�����Ӧ�Ĵ洢�����ͨ������setInitialValue��������i������setInitialValue�����У���һ�������
         * *T value = initialValue()�� ��Ĭ������£�initialValue�������ص���null
         **/
	}

}
