package com.stringBuffer;

public class Vowels {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		String str="Parag Dattatray Gavande";
		int vowel_count=0;
		int consonent_count=0;
		int len=str.length();
		
		for(int i=0; i<len; i++) {
			char ch=str.charAt(i);
			if(ch=='A'|| ch=='E'|| ch=='I'||ch=='O'|| ch=='U' || ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ) {
				vowel_count++;
			}
			else if(ch==' '){
				continue;
			}
			else {
				consonent_count++;
			}
			
		}
		System.out.println(vowel_count);
		System.out.println(consonent_count);
		

	}

}
