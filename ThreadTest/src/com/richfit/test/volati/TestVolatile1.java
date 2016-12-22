package com.richfit.test.volati;


public class TestVolatile1 {

    public volatile int inc = 0;
    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final TestVolatile1 test = new TestVolatile1();
        for(int i=0;i<100;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1;j++)
                        test.increase();
                };
            }.start();
        }

    while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test.inc);

    }

}
