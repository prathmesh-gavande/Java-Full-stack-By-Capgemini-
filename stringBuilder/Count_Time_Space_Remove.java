package com.stringBuilder;

public class Count_Time_Space_Remove {

	public static void main(String[] args) {
		String str="   Parag Dattatray Gavande  ";
		int space_count=0;
		int len=str.length();
		String ans="";
		for(int i=0; i<len; i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				space_count++;
			}
			else {
				ans+=ch;
			}
		}
		System.out.println("Total No Of Spaces: "+space_count);
		System.out.println("String Without Space: "+ans);

	}

}
