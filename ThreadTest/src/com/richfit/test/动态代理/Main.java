package com.richfit.test.��̬����;

import java.lang.reflect.Proxy;

public class Main
{

	public static void main(String[] args)
	{
		// �����н���ʵ��
		DynamicProxy inter = new DynamicProxy(new Vendor());

		// ��ȡ������ʵ��sell
		Sell sell = (Sell) (Proxy.newProxyInstance(Sell.class.getClassLoader(),
				new Class[] { Sell.class }, inter));

		// ͨ�������������ô����෽����ʵ���ϻ�ת��invoke��������
		sell.sell();
		sell.ad();

	}

}
