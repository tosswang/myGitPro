package �̳�synchorized�����׶�.ͬ�������;

public class ThreadA extends Thread
{
	private ObjectService service;
	public ThreadA(ObjectService service)
	{
		this.service=service;
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		super.run();
		service.doLongTimeTask();
	}
}
