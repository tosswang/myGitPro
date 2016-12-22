package com.richfit.test.ABA;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class ABA {
	 private static AtomicInteger atomicInt = new AtomicInteger(100);
     private static AtomicStampedReference atomicStampedRef = new AtomicStampedReference(100, 0);

     public static void main(String[] args) throws InterruptedException {
             /*Thread intT1 = new Thread(new Runnable() {
                     @Override
                     public void run() {
                    	  
                             boolean c1=atomicInt.compareAndSet(100, 101);
                             boolean c2=atomicInt.compareAndSet(101, 100);
                             System.out.println("c1:"+c1);
                             System.out.println("c2:"+c2);
                          ;
                     }
             });

             Thread intT2 = new Thread(new Runnable() {
                     @Override
                     public void run() {
                             try {
                                     TimeUnit.SECONDS.sleep(1);
                             } catch (InterruptedException e) {
                             }
                          
                             boolean c3 = atomicInt.compareAndSet(100, 101);
                             System.out.println(c3); // true
                          
                     }
             });

             intT1.start();
             intT2.start();
             intT1.join();
             intT2.join();*/

          Thread refT1 = new Thread(new Runnable() {
                     @Override
                     public void run() {
                             try {
                                     //TimeUnit.SECONDS.sleep(1);
                             } catch (Exception e) {
                             }
                            boolean flag= atomicStampedRef.compareAndSet(100, 101, atomicStampedRef.getStamp(), atomicStampedRef.getStamp() + 1);
                            boolean flag1= atomicStampedRef.compareAndSet(101, 100, atomicStampedRef.getStamp(), atomicStampedRef.getStamp() + 1);
                            System.out.println("线程一的第一个运行结果："+flag);
                            System.out.println("线程一的第二个运行结果："+flag1);
                     }
             });

             Thread refT2 = new Thread(new Runnable() {
                     @Override
                     public void run() {
                             int stamp = atomicStampedRef.getStamp();
                             try {
                                     //TimeUnit.SECONDS.sleep(2);
                             } catch (Exception e) {
                             }
                             boolean c3 = atomicStampedRef.compareAndSet(100, 101, stamp, stamp + 1);
                             System.out.println("线程二的运行结果："+c3); // false
                     }
             });

             refT1.start();
             refT2.start();
     }
}
