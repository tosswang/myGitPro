package com.richfit.test.productcustomer2;

import java.util.Vector;

public class ThreadWaitNotifyTest {
	public static void main(String args[]) {
			Vector obj = new Vector();
			Thread consumer = new Thread(new Consumer(obj));
			Thread producter = new Thread(new Producter(obj));
			consumer.start();
			producter.start();
		}
}
