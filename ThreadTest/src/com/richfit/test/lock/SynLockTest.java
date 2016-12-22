package com.richfit.test.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynLockTest {

	public static void main(String[] args) {
        //�����������ʵ��˻�
       MyCount myCount = new MyCount("95599200901215522", 10000);
        //����һ��������
       FairLock lock = new FairLock();
        //����һ���̳߳�
       ExecutorService pool = Executors.newCachedThreadPool(); 
        //����һЩ���������û���һ�����ÿ�����Ĵ棬ȡ��ȡ�������ְ�
       User u1 = new User("����", myCount, -4000, lock); 
        User u2 = new User("��������", myCount, 6000, lock); 
        User u3 = new User("��������", myCount, -8000, lock); 
        User u4 = new User("����", myCount, 800, lock);
        //���̳߳���ִ�и����û��Ĳ���
       pool.execute(u1); 
        pool.execute(u2); 
        pool.execute(u3); 
        pool.execute(u4); 
        //�ر��̳߳�
        
        for(int i =0;i<=20;i++)
        {
        	User u=new User("����", myCount, -2000, lock);
        	pool.execute(u);
        }
       pool.shutdown(); 
	} 
		
}
