package com.synchronization3;

public class StudentExist {

	synchronized static void studentExist(double n) {
	
		
		for(int i=1;i<=5;i++) {
			System.out.println("Student "+i+" Exist");
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}


}
