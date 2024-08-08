package WeakHashMapPackage;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
	/*
	 * Does not allows duplicate value
	 * Implementation of Map Interface
	 * non-synchronize
	 * capacity is 16 bit
	 * capacity increase by 0.75
	 */
	public static void main(String[] args) {
		WeakHashMap<Integer, String> wm =new WeakHashMap<Integer, String>();
		
		wm.put(9, "Prathmesh");
		wm.put(6, "Parag");
		wm.put(1, "Ram");
		wm.put(null, null);
		wm.put(3, null);
		System.out.println(wm);
		System.gc();
		System.out.println("=========================");
		System.out.println(wm);
		wm.put(null, "Prathmesh");
		
		System.out.println(wm);
		System.gc();
		System.out.println("=========================");
		System.out.println(wm);
		
	}

}
