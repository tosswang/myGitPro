package com.richfit.test.productcustomer3;

public class Test {
	
	public static void main(String[] args)
	{
		Target t = new Target();
		
		Thread t1 = new Increase(t);
		t1.setName("Increase");
		Thread t2 = new Decrease(t);
		t2.setName("Decrease");
		
		t1.start();
		t2.start();
	}
}
