package �̳�synchorized�����׶�.ͬ�������;

public class ThreadB extends Thread
{
	private ObjectService service;
	public ThreadB(ObjectService service)
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
