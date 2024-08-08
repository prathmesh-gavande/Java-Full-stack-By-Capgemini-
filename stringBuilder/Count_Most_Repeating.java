package com.stringBuilder;
import java.util.*;
public class Count_Most_Repeating {

	public static void main(String[] args) {
		
		String str="ParagGavande";
		HashMap<Character, Integer>mp=new HashMap<>();
		int len=str.length();
		
		for(int i=0; i<len; i++) {
			char ch=str.charAt(i);
			mp.put(ch,mp.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character,Integer>m:mp.entrySet()) {
			System.out.println("Character: "+m.getKey()+" Value : "+m.getValue());
		}

	}

}
