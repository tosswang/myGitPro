package com.richfit.test.动态代理;

import java.lang.reflect.Proxy;

public class Main
{

	public static void main(String[] args)
	{
		// 创建中介类实例
		DynamicProxy inter = new DynamicProxy(new Vendor());

		// 获取代理类实例sell
		Sell sell = (Sell) (Proxy.newProxyInstance(Sell.class.getClassLoader(),
				new Class[] { Sell.class }, inter));

		// 通过代理类对象调用代理类方法，实际上会转到invoke方法调用
		sell.sell();
		sell.ad();

	}

}
