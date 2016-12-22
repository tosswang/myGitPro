package com.richfit.test.productcustomer2;

import java.util.Vector;

public class Producter implements Runnable {

	private Vector obj;
	public Producter(Vector v) {
		this.obj = v;
	}
	public void run() {
		synchronized(obj) {
			while (true) {
				try {
				if (obj.size() !=0){
					System.out.println("生产者释放锁");
					obj.wait();
					System.out.println("生产者这里应该没有输出");
				}
			
				obj.add(new String("apples"));
				obj.notify();
				System.out.println("Producter:obj are ready");
				Thread.sleep(500);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
