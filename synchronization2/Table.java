package com.synchronization2;

public class Table {
	
	synchronized static void printTable(double n) {
	
		
		for(int i=1;i<=10;i++) {
			System.out.println(n*i+" ");
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}
