package exercise1;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap <Integer, String> hm = new HashMap <Integer, String> ();
		hm.put(1, "Value1");
		hm.put(4, "Value4");
		hm.put(3, "Value3");
		hm.put(5, "Value5");
		hm.put(6, "Value6");
		hm.put(9, "Value9");
		hm.put(0, "Value0");
		
		System.out.println("Display: "+ hm);
		System.out.println("Size: "+ hm.size());
		System.out.println("Is hm empty? "+hm.isEmpty());
		
		Object key2 = hm.remove(2);
		System.out.println("Remove key 2: "+key2);
		System.out.println("Remove key 4: "+hm.remove(4));
		System.out.println("Display: "+ hm);
		System.out.println("Remove key 6: "+hm.remove(6));
		System.out.println("Display: "+ hm);
		System.out.println("Key 2: "+hm.containsKey(2));
		System.out.println("key 5: "+hm.containsKey(5));
		System.out.println("Key 7: "+hm.containsKey(7));
		
		hm.clear();
		System.out.println("Display: "+ hm);
		
		System.out.println("Is hm empty? "+hm.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
