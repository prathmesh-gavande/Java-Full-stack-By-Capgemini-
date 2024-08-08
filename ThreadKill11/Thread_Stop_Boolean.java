package com.ThreadKill11;

public class Thread_Stop_Boolean implements Runnable{

	boolean stop=false;
	public void run() {
		System.out.println("Thread Is Running ");
		
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
			if(i==5) {
				if(stop==true) {
					return;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Thread_Stop_Boolean ts=new Thread_Stop_Boolean();
		Thread t=new Thread(ts);
		t.start();
		ts.stop=true;

	}

}
