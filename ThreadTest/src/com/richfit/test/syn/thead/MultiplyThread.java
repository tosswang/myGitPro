package com.richfit.test.syn.thead;

public class MultiplyThread extends Thread {
	private Sample sample;
    public MultiplyThread(Sample sample){
        this.sample = sample;
    }
    @Override
    public void run() {
        for(int i = 0; i < 20; i++){
            sample.mulip();           
        }
    }
}
