package �̳�violate�������ӿ�������violate������;

public class RunThread extends Thread
{
	//volatile private boolean isRunning =true;

	private boolean isRunning =true;
	
	public boolean isRunning()
	{
		return isRunning;
	}

	public void setRunning(boolean isRunning)
	{
		this.isRunning = isRunning;
	}
	
	public void run()
	{
		System.out.println("����Run");
		while(isRunning==true)
		{	
			System.out.println("СЬ����,��������");
		}
		System.out.println("�̱߳�ֹͣ��");
	}
}
