import java.util.*; 
class LinkedHashMapDemo {
	/*
	 * LinkedHashMap =Linkedlist + Hashmap
	 * it implements Hashtable
	 * it contains only unique value
	 * Linked hashmap is non synchronized
	 * it allows only one null key, but values can have multiple null
	 * initial capacity is 16 & its load factor is 0.75
	 * it maintains insertion order
	 * 
	 */

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lh=new LinkedHashMap<Integer, String>();
		lh.put(1, "Prathmesh");
		lh.put(null, "Prathmesh");
		lh.put(2, "Parag");
		lh.put(null, "Ram");
		lh.put(3, "Shyam");
		lh.put(3, "Parag");
		lh.put(null, null);
		System.out.println(lh.size());

		System.out.println(lh);
		System.out.println("=========================================");
		
		LinkedHashMap<Integer, String> lh2= new LinkedHashMap<Integer, String>(2);
		lh2.put(1, "Prathmesh");
		lh2.put(null, "Prathmesh");
		lh2.put(2, "Parag");
		lh2.put(null, "Ram");
		lh2.put(3, "Shyam");
		lh2.put(3, "Parag");
		lh2.put(null, null);
		System.out.println(lh2);
		 
		
		lh.remove(2);
		System.out.println(lh);
		System.out.println("========================================="); 
		System.out.println(lh);
		System.out.println("=========================================");
		for(Map.Entry<Integer, String> it : lh.entrySet() ) {
			System.out.println("Key : "+ it.getKey()+ "  values: "+it.getValue());
			
		}
		
	}
}
