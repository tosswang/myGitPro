package 教程锁的集成;

public class Sub extends Main
{
	synchronized public void operateISubMethod()
	{
		try
		{
			while(i>0)
			{
				i--;
				System.out.println("sub print i="+i);
				Thread.sleep(100);
				/**子类完全可以通过可重入锁调用父类的同步方法，其实我感觉既然是继承，那就相当于父类的方法也就是子类的方法，所以必然可以这么搞**/
				this.operateIMainMethod();
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
