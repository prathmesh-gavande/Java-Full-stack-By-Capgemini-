package com.multiThreaded;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		
		MyThread mt=new MyThread();
		Thread t=new Thread(mt,"MyThread");
		t.setPriority(2);
		
		System.out.println("Priority: "+t.getPriority());
		System.out.println("Thread Name: "+t.getName());
		t.start();

	}

}
