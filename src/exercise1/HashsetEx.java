package exercise1;

import java.util.HashSet;

public class HashsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet <String> hs = new HashSet<String>();
		System.out.println("Display HashSet: "+hs);
		System.out.println("Size: "+hs.size());
		hs.add("Orange");
		hs.add("Apple");
		hs.add("Mango");
		hs.add("Kivi");
		hs.add("Orange");
		hs.add("Peach");
		
		System.out.println("Display HashSet: "+hs);
		System.out.println("Size: "+hs.size());
	}

}
