package com.richfit.test.syn.thead;

public class DecreaseThread extends Thread {
	
	private Sample sample;
    public DecreaseThread(Sample sample){
        this.sample = sample;
    }
    @Override
    public void run() {
        for(int i = 0; i < 20; i++){
            sample.decrease();           
        }
    }

}
