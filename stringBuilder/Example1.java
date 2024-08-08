package com.stringBuilder;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Time Required By String Buffer To Execute The Same Task ");
		long startTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("Parag");
		for(int i=0;i<100000;i++) {
			sb.append("Gavande");
		}
		System.out.println("Total Execution Time Using StringBuffer Class: "+ (System.currentTimeMillis()-startTime) +" ms");
		
		System.out.println("===============================================================");
		
		System.out.println("Time Required By String Builder To Execute The Same Task ");
		long startTime1=System.currentTimeMillis();
		StringBuilder sbd=new StringBuilder("Parag");
		for(int i=0;i<100000;i++) {
			sb.append("Gavande");
		}
		System.out.println("Total Execution Time Using StringBuilder Class: " + (System.currentTimeMillis()-startTime1) + " ms");
		
		System.out.println("===============================================================");
		
		System.out.println("Time Required By String Class To Execute The Same Task ");
		long startTime2=System.currentTimeMillis();
		String str1="Parag"; 
		for(int i=0;i<100000;i++) {
			str1+="Gavande";
		}
		System.out.println("Total Execution Time Using String Class: " + (System.currentTimeMillis()-startTime2) + " ms");
		
		
		
	}

}
