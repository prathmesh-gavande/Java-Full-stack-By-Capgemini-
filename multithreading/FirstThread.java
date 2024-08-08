package com.multithreading;

public class FirstThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(i+ " ");
		}
		System.out.println("First thread is runing");
	}
	
	public static void main(String[] args) {
		System.out.println("main thread is runing");
		FirstThread ft=new FirstThread();
		ft.run();
	}
}
