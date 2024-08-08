package TreeMapdemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapdemo1 {

	/*
	 * It contains only unique elements
	 * Tree map is Non-synchronize
	 *  null key not allow
	 * Have multiple Null values
	 * It use the data structure binary search tree
	 */
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
		tm.put(5, "Prathmesh");
		tm.put(3, "Parag");
		tm.put(6, "ram");
		tm.put(10, null);
		
		System.out.println(tm);
		System.out.println(tm.size());
		System.out.println("=========================================");
		for(Map.Entry<Integer, String> it : tm.entrySet() ) {
			System.out.println("Key : "+ it.getKey()+ "  values: "+it.getValue());
			
		}
		
		System.out.println(tm.values());
		System.out.println(tm.keySet());
		
		System.out.println(tm.ceilingKey(-1));
		System.out.println(tm.ceilingEntry(-1));
		System.out.println(tm.floorKey(6));
		System.out.println(tm.floorEntry(6));
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.higherKey(3));
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		
		tm.descendingMap();
		System.out.println(tm);
		System.out.println("=========================================");	
		System.out.println(tm.tailMap(3));
	}

}
