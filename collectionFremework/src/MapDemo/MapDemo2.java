package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<Character, String>hm =new HashMap<Character, String>();
		hm.put('S', "Sunday");
		hm.put('M', "Monday");
		hm.put('T', "Tuesday");
		hm.put('W', "Wednesday");
		hm.put('T', "Thursday");
		hm.put('F', "friday");
		hm.put('S', "Saturday");
		
		System.out.println(hm);
		
		Map<Integer, String> hm1=new HashMap<Integer, String>();
		hm1.put(1, "Sunday");
		hm1.put(2, "Monday");
		hm1.put(3, "Tuesday");
		hm1.put(4, "Wednesday");
		hm1.put(5, "Thursday");
		hm1.put(6, "friday");
		hm1.put(7, "Saturday");
		
		System.out.println(hm1);
		
		for(Map.Entry<Integer, String> obj : hm1.entrySet()) {
			System.out.println("No. "+obj.getKey() + " Day "+ obj.getValue());
		}
		
	}

}
