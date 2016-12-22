package 教程锁对象发生变更;

public class Run2
{

	public static void main(String[] args)
	{
		MyService service=new MyService();
		ThreadA a=new ThreadA(service);
		a.setName("A");
		ThreadB b=new ThreadB (service);
		b.setName("B");
		/**a、b一起开始运行，同时争抢锁123，这个也不一定，例子不太好，我就运行出了如下结果
		 * A begin 1477557190812
			B begin 1477557190813
			A end 1477557191813
			B end 1477557191813
		 * ***/
		a.start();
	    b.start();

	}

}
