package �̳�SimpleDateFormat���̰߳�ȫ;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread
{
	/**һ������£�new һ�� MyThread�����ͻ���2���Լ��ı���sdf��dateString��������sdf�Ƕ���߳��õ�һ��������dateString�Ǹ��Ե�˽�б���**/
	private SimpleDateFormat sdf;
	private String dateString;
	
	public MyThread(SimpleDateFormat sdf,String dateString)
	{
		this.sdf=sdf;
		this.dateString=dateString;
	}
	
	@Override
	public void run()
	{
		try
		{
			Date date=sdf.parse(dateString);
			String newDateString=sdf.format(date).toString();
			if(!newDateString.equals(dateString))
			{
				System.out.println("ThreadName="+this.getName()+" ������ �����ַ�����"+dateString+"ת���ɵ�����Ϊ��"+newDateString);
			}
				
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
}
