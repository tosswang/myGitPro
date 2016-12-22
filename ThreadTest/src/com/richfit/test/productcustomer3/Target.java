package com.richfit.test.productcustomer3;

public class Target {
private int count;
	
	public synchronized void increase()
	{
		if(count == 2)
		{
			try
			{
				wait();
				System.out.println("increase ֮��ִ��");
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		count++;
		System.out.println(Thread.currentThread().getName() + ":" + count);
		notify();
	}
	
	public synchronized void decrease()
	{
		if(count == 0)
		{
			try
			{
				//�ȴ�������Decrease�̵߳��õĸ÷���,
				//����Decrease�߳̽������t(main������ʵ������)�ĵȴ��أ������ͷŶ���t����
				wait();//Object��ķ���
				System.out.println("decrease ֮��ִ��");
				/**
				 * ����һ������Ϊǿ��֢��Ϯ����ֱ�ͱ�ɶ����ˣ�һֱ��Ϊ���ִ�и÷������̣߳���һ�ν��뵽����ʱ��wait()֮�󣬻����ȴ��أ�Ȼ��ϵͳ���з���ʱ��������̵߳õ��˻���
				 * �����������õ�����,Ȼ���ִ��wait()֮�����䣬�����ٴ��ͷ�����Ȼ��ϵͳ�ٴη���������ᣬ��ô�����ٴ�ִ��wait֮��ķ���......�ⲻ��ˮ�ȶ��ˣ����Թ����������
				 * ����һ��ִ����wait֮�����䣬�̻߳��ͷ�������ʱ��Ϊ����ִ���˴��룬��������Ȼ�������ȴ��ذ����ǻ�����������ذ���������ʹ�ٴη���������������Ҳ������
				 * ִ�д��룬��ô���������ٴδ�wait֮��ִ�д����أ�ǿ��֢�����˰�
				 * **/
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		count--;
		System.out.println(Thread.currentThread().getName() + ":" + count);
		
		//�����߳�Increase��Increase�̴߳ӵȴ��ص�����
		notify();
	}
}
