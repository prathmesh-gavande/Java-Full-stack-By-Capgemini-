package MapDemo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class MapDemo1 {
	/*
	 * Duplicate Key invalid
	 * 
	 */
	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(101, "Prathmesh");
		m.put(102, "Parag");
		m.put(103, "Sandip");
		m.put(104, "Rohan");
		m.put(105, "Prathmesh");
		m.put(106, null);
		m.put(null, "Prathmesh");
		System.out.println(m);
		
		System.out.println("=====================================================================================");
		m.remove(105, "Prathmesh");
		System.out.println(m);
		
		System.out.println("=====================================================================================");
		m.replace(102, "Shyam");
		System.out.println(m);
		
		System.out.println("======================================================================================");
		m.replace(102, "Shyam","Parag");
		System.out.println(m);
		
		Iterator itr=m.values().iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		
		System.out.println("======================================================================================");
		for(String s: m.values()) {
			System.out.println(s);
		}
		
		System.out.println("======================================================================================");
		Iterator itr2=m.keySet().iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next()+" ");
		}
		
	}

}
