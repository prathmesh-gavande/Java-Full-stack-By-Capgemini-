package strigbuffer;

import java.util.*;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		System.out.println("--------------------------------");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Prathmesh");
		System.out.println(sb);
		
		System.out.println("--------------------------------");
		sb.append("Gavande");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		System.out.println("--------------------------------");
		sb.append("From Nandurbar");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		// StrigBuffeer is mutable
		// initialize capacity 16 Bytes
		// capacity increase by (previous size*2+2)
		
		System.out.println("--------------------------------");
		System.out.println("length: "+sb.length());
		sb.setCharAt(0, 'A');
		System.out.println(sb);
		System.out.println("--------------------------------");
		System.out.println("reverse: "+sb.reverse());
		
		System.out.println("--------------------------------");
		StringBuffer sb1=new StringBuffer(100);
		System.out.println("sb1 capacity: "+sb1.capacity());
		sb1.append("ram Gavande");
		System.out.println(sb1);
		System.out.println("--------------------------------");
		
		StringBuffer sb3=new StringBuffer("ABCS");
		System.out.println("sb3 : "+sb3);
		System.out.println("sb3 capacity: "+sb3.capacity());
		
		sb3.append("XYZ");
		System.out.println("sb3 : "+sb3);
		System.out.println("sb3 capacity: "+sb3.capacity());
		
		
		sb3.append("AGEHSYJSETWUKSHA");
		System.out.println("sb3 : "+sb3);
		// previous capacity*2 +2 -> 20*2+2=42
		System.out.println("sb3 capacity: "+sb3.capacity());
		
		System.out.println("--------------------------------");
		StringBuffer sb4=new StringBuffer("     Prathmesh ");  // capacity= length+16 
		System.out.println("sb4 : "+sb4);
		System.out.println("length: "+sb4.length());
		sb4.append("From                                           Nandurbar");
		System.out.println("sb4 : "+sb4);
		System.out.println("sb4 capacity: "+sb4.capacity());
		sb.ensureCapacity(20);
		System.out.println("sb4 capacity: "+sb4.capacity());

		
		
	}

}
