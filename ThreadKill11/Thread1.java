package com.ThreadKill11;

public class Thread1 implements Runnable{

	Thread t1;
	@Override
	public void run() {
		System.out.println("Thread Is Running");
		int i=0;
		while(i<10) {
			System.out.println("i "+i);
			
			if(i==5) {
				t1.stop();     // this are Depricated Method 
			}
			i=i+1;
		}
	}
	
	public static void main(String[] args) {
		Thread1 th=new Thread1();
		Thread t=new Thread(th);
		t.start();
		t.start(); //After Thread Kill thread is Again start 

	}

}
