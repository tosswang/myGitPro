package ���ùܵ������̹߳�ͨʾ��2;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Send implements Runnable
{
	// ʵ��Runnable�ӿ�
	private PipedOutputStream pos = null; // �ܵ������

	public Send()
	{
		this.pos = new PipedOutputStream();// ʵ���������
	}

	public void run()
	{
		String str = "Hello World!!!";
		try
		{
			this.pos.write(str.getBytes()); // �����Ϣ
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		try
		{
			this.pos.close(); // �ر������
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public PipedOutputStream getPos()
	{ // ͨ���߳���õ������
		return pos;
	}

}
