package com.stringBuffer;

import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Parag");
		System.out.println(sb);
		sb.append("Gavande");
		System.out.println(sb);
		sb.append("From T.Y. B.Tech");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Computer Engineer and I live in Nandurbar.");
		System.out.println(sb);
		System.out.println("Capacity: "+sb.capacity());
		
		System.out.println("*****************************************************************");
		StringBuffer sb1=new StringBuffer();
		sb1.append("Shyam");
		System.out.println(sb1.reverse());
		System.out.println("Length: "+sb1.length());
		sb1.setCharAt(2,'A');
		System.out.println(sb1);
		
		
		System.out.println("*****************************************************************");
		
		StringBuffer sb2=new StringBuffer(100);
		System.out.println("Capacity Before Insertion: "+sb2.capacity());
		sb2.append("qwertyuipoiulkjhgfdsamnbvcxzqwertyuio");
		System.out.println("Capacity After Insertion: "+sb2.capacity());
		sb2.append("qwertyuipoiulkjhgfdsamnbvcxzqwertyuioqwertyuiasdfghjklzxcvbnmqwertyuioasdfghjklzxcvbnmqwertyuiopsdfghjklzxcvbnmqwertyuiopsdfghjklzxcvbnmqwertyuiopasdfghjklxcvbnmqwertyuiopasdfghjklzxcvbnmqw");
		System.out.println("Capacity After Insertion beyond 100 char: "+sb2.capacity());
		
		StringBuffer sb3=new StringBuffer("ABCD"); //16+4=20
		System.out.println("Capacity: "+sb3.capacity()); //20
		sb3.append("XYZ");  
		System.out.println("Capacity: "+sb3.capacity());  ////capacity =20 because their is only 7 characters present in 20 Byte memory 
		sb3.append("XYZASDFGHJKLIUYTE");  
		System.out.println("Capacity: "+sb3.capacity());
		
		System.out.println("*****************************************************************");
		
		
		StringBuffer sb4=new StringBuffer();
		sb4.append("          Parag   Gavande     ");
		sb4.trimToSize();
		System.out.println(sb4);
		System.out.println("Length: "+sb4.length());
		sb4.append("asnbhctyhgfrtyiuiokjhgfdsaqwertyc");  
		System.out.println("sb4 Capacity: "+sb4.capacity());
		sb4.ensureCapacity(20);
		System.out.println("sb4 Capacity: "+sb4.capacity());
		
		System.out.println("*****************************************************************");
		//Reverse String object using String Buffer Class 
		String a="abcde";
		
		StringBuffer b=new StringBuffer(a);
		b.reverse();
		System.out.println(b);
		
		System.out.println("*****************************************************************");
		
		
		
		
		
	}

}
