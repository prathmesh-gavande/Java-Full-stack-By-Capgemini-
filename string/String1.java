package com.string;

public class String1 {

	public static void main(String[] args) {
		
		String s="Parag";
		String s1="Gavande";
		
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.concat(s1));
		
		String s2=new String("Shirpur");
		System.out.println(s2);
		s2="Pune";
		System.out.println(s2);
		System.out.println(s.charAt(2));
		System.out.println(s2.compareTo(s));
		System.out.println(s.contains("p"));
		System.out.println(s.endsWith("g"));
		System.out.println(s.toUpperCase());

	}

}
