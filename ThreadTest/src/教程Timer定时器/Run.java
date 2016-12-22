package �̳�Timer��ʱ��;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run
{
	/**
	 * new Timer() ��Դ���֪������һ���̣߳��߳�start����Ȼ�Ὺʼrun�����Է��֣�
	 * run��ʱ���while(true)һ�δ��룬��δ������Ա���queue�������������Ϊ��
	 * �Ͱ����е��߳�������queue�����ĵȴ������У����ͷ�����
	 * ��ִ��Timer�е�schedule����ʱ���ỽ��������queue�����ĵȴ������е��̣߳��������ִ��
	 * ��queue��ȥ��task����������run��������ִ�С�ִ�����Ч��while(true)��ѭ��������
	 * ��Ȼ����ִ�����ˣ����ǻ����߳�û������
	 * **/
	private static Timer timer=new Timer();
	static public class MyTask extends TimerTask
	{
		@Override
		public void run()
		{
			System.out.println("�����ˣ�ʱ��Ϊ��"+new Date());
		}
	}
	
	public static void main(String[] str)
	{
		try
		{
			MyTask myTask=new MyTask();
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			String dateString="2016-11-07 13:28:50";
			
			Date dataRef=sdf.parse(dateString);
			/**TimerThreadԴ���497�У�taskFired = (executionTime<=currentTime)
			 * ��ͨ����ǰʱ����ִ��ʱ��Ƚϣ����Ϊtrueʱ���ͻ����task�е�run
			 * **/
			timer.schedule(myTask, dataRef);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
