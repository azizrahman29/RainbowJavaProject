package exercise1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <String> fruits = new LinkedList <String> ();
		
		System.out.println("Display: "+fruits);
		System.out.println("Size: "+fruits.size());
		
		
		
		fruits.add("Mango");
		
		fruits.add("Orange");
		
		fruits.add("Apple");
		
		fruits.add("Strawburry");
		
		fruits.add("Pea");
		
		fruits.add("Mango");
		System.out.println("Display: "+fruits);
		System.out.println("Size: "+fruits.size());
		
		System.out.println("\nFor Loop!");
		
		for (int i = 0 ; i<fruits.size(); i++){
			System.out.println("Fruits: "+fruits.get(i));
			
		}
				
		System.out.println("\nUsing Iterator Loop!");
		Iterator i = fruits.iterator();
		while(i.hasNext()) {
		System.out.println("Fruits: "+i.next());
				
		}
		
		System.out.println("\nWhile Loop!");
		
		int count =0;
		while (fruits.size()<count) {
			System.out.println("fruits: "+fruits.get(count));
		}
				
		
		
		
		
		
		
		
		
		
		
	}

}
