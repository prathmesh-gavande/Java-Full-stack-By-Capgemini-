package com.synchronization3;

synchronized static public class CheckOut {

	
	for(int i=1;i<=5;i++) {
		System.out.println(i+" st Student check out");
		
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println();

}
}
