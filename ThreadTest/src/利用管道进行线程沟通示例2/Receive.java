package ���ùܵ������̹߳�ͨʾ��2;

import java.io.IOException;
import java.io.PipedInputStream;

public class Receive implements Runnable
{
	private PipedInputStream pis = null;

	public Receive()
	{
		this.pis = new PipedInputStream(); // ʵ����������
	}

	public void run()
	{
		byte b[] = new byte[1024];
		int len = 0;
		try
		{
			len = this.pis.read(b); // ��������
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		try
		{
			this.pis.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("���յ�����Ϊ��" + new String(b, 0, len));
	}

	public PipedInputStream getPis()
	{
		return pis;
	}

}
