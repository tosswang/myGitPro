package �̳����ļ���;

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
				/**������ȫ����ͨ�������������ø����ͬ����������ʵ�Ҹо���Ȼ�Ǽ̳У��Ǿ��൱�ڸ���ķ���Ҳ��������ķ��������Ա�Ȼ������ô��**/
				this.operateIMainMethod();
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
