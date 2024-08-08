package com.join;

public class NewThread implements Runnable{

	public void run() {
		System.out.println("Child Thread Is Running");
		for(int i=0;i<5;i++) {
			System.out.println("I: "+i);
		}
		System.out.println("Child Thread Is Ended (It Is Dead)");
	}
	
	public static void main(String[] args) {
		NewThread nt=new NewThread();
		Thread T=new Thread(nt);
		T.start();
		
//		NewThread nt1=new NewThread();
//		Thread T1=new Thread(nt1);
//		T1.start();
		
		
		try {
			T.join(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Ending");

	}

}
