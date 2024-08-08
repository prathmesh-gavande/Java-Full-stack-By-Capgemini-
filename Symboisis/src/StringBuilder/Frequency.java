package StringBuilder;
import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "prathmeshgavande";
		HashMap <Character, Integer > hp=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			hp.put(ch,hp.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry <Character, Integer > m:hp.entrySet()) {
			System.out.println("Character : "+ m.getKey()+" Value : "+ m.getValue());
		}
		
//		for(int i=0;i<26;i++) {
//			if(arr[i]>0) {
//				System.out.println(arr[i]);
//			}
//		}
	}

}
