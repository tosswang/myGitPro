package com.richfit.test.productcustomer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Storage {
	BlockingQueue<Product> queues = new LinkedBlockingQueue<Product>(10);

    /**
     * ����
     * 
     * @param p
     *            ��Ʒ
     * @throws InterruptedException
     */
    public void push(Product p) throws InterruptedException {
        queues.put(p);
    }

    /**
     * ����
     * 
     * @return ��Ʒ
     * @throws InterruptedException
     */
    public Product pop() throws InterruptedException {
        return queues.take();
    }

}
