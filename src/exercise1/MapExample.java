package exercise1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap <Integer,String> hs = new HashMap <Integer,String>();
		

		System.out.println("Display HashMap: "+hs);
		System.out.println("Siz of hs: "+hs.size());
		
		hs.put(1, "Ali");
		hs.put(2, "Sabir");
		hs.put(3, "Jalal");
		hs.put(4, "Musa");
		hs.put(1, "Ali");
		hs.put(6, "Sara");
		hs.put(7, "  ");
		System.out.println("Display HashMap: "+hs);
		System.out.println("Siz of hs: "+hs.size());
		
		Set hm = hs.entrySet();
		Iterator i = hm.iterator();
		
		while (i.hasNext()) {
			Map.Entry mEntry =(Map.Entry )i.next();
			System.out.println("Key: " +mEntry.getKey()+"  Value: "+mEntry.getValue());
		}
	
		String index2 = hs.get(2);
		System.out.println(index2);
		System.out.println("Display HashMap: "+hs);
		
		String r_index2 = hs.remove(index2);
		System.out.println();
		System.out.println("Display HashMap: "+hs);
	}

}
