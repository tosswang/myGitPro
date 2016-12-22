package 教程ThreadLocal实例.实例1;

public class Test
{
	ThreadLocal<Long> longLocal = new ThreadLocal<Long>();

	ThreadLocal<String> stringLocal = new ThreadLocal<String>();

	public void set()
	{

		/**需要注意：ThreadLocal的set方法是把当前对象作为map的键值，
		 * 这里的key值就是longLocal和stringLocal
		 * 把set方法的参数作为value！！！
		 * 他们是和线程牢牢绑定在一起的阴魂不散的，哪个线程执行了他们，他们就粘上了哪一个线程
		 * 在本例中每一个线程的threadLocals变量含有2个ThreadLocal，对应的key值就是变量longLocal和变量stringLocal
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
         * *1.本例2个线程，验证了通过ThreadLocal创建的副本是存储在每个线程自己的threadLocals中的；
         * *2.为何threadLocals的类型ThreadLocalMap的键值为ThreadLocal实例，因为每个线程中可以有多个threadLocal变量
         * *3.在进行get之前，必须先set，否则会报空指针异常； 如果想在get之前不需要调用set就能正常访问的话，必须重写initialValue()方法。
         * *如果没有先set的话，即在map中查找不到对应的存储，则会通过调用setInitialValue方法返回i，而在setInitialValue方法中，有一个语句是
         * *T value = initialValue()， 而默认情况下，initialValue方法返回的是null
         **/
	}

}
