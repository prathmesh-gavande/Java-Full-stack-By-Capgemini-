package com.multithreading;

public class MyThread implements Runnable{

	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		t.start();

	}

}
