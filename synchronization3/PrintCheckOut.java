package com.synchronization3;

public class PrintCheckOut {

	for(int i=1;i<=5;i++) {
		System.out.println(i+" th Student Check Out .");
		
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println();

}
