package exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListNamesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> name = new ArrayList <String> ();
		System.out.println("Display: "+name);
		System.out.println("Size: "+name.size());
		
		name.add("Ali");
		name.add("Ahmad");
		name.add("Muhammad");
		name.add("Iqbal");
		name.add("Basir");
		name.add("Kabir");
		//name.add(null);
		System.out.println("Display: "+name);
	
		System.out.println("Size: "+name.size());

		System.out.println("Position 5: "+name.get(5));
		
		System.out.println("\nFor each Loop/ Advance Loop:  ");
		
		for(String n:name) {
			System.out.println("Name: "+n);
			
		
			}
		System.out.println("\nFor Loop: ");
		
		for(int i = 0; i<name.size();i++) {
			System.out.println("Name: "+name.get(i));
		}
		
		System.out.println("\nWhile Loop: ");
		
		int count = 0;
		while (name.size()>count) {
			System.out.println("Name: "+name.get(count++));
		}
		
		System.out.println("\nIterator");
		Iterator i =name.iterator();
		
		System.out.println();
		while (i.hasNext()) {
			System.out.println("Name: "+i.next());
		}
		
	Collections.sort(name);
	System.out.println("\nDisplay Names: "+name);
	
	Collections.sort(name, Collections.reverseOrder());
	System.out.println("\nDisplay Reversed Names: "+name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
