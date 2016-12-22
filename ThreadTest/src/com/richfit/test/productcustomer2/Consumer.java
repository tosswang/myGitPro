package com.richfit.test.productcustomer2;

import java.util.Vector;

public class Consumer implements Runnable {

	private Vector obj;
	public Consumer(Vector v) {
		this.obj = v;
	}
	public void run() {
		synchronized(obj) {
			while (true) {
			try {
			if (obj.size() ==0){
				System.out.println("�������ͷ���");
				obj.wait();
				System.out.println("����������Ӧ��û�����");
			}
			
			System.out.println("Consumer:goods have been taken");
			System.out.println("obj size: " + obj.size());
			obj.clear();
			obj.notify();
			}
			catch(Exception e) {
			e.printStackTrace();
			}
		}
		}
	}
}
