package ���ùܵ������̹߳�ͨʾ��2;

import java.io.IOException;

public class TestPipe
{

	public static void main(String[] args)
	{
		 Send s = new Send(); 
	        Receive r = new Receive(); 
	        try { 
	            s.getPos().connect(r.getPis()); // ���ӹܵ� 
	        } catch (IOException e) { 
	            e.printStackTrace(); 
	        } 
	        new Thread(s).start(); // �����߳� 
	        new Thread(r).start(); // �����߳� 
	}

}
