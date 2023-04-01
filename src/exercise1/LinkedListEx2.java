package exercise1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList <Integer> ll = new LinkedList <Integer>();
		System.out.println("Display: "+ ll);
		System.out.println("Size: "+ll.size());
		ll.add(2);
		ll.add(4);
		ll.add(3);
		ll.add(5);
		ll.add(9);
		ll.add(7);
		ll.add(3);
		ll.add(0);
		
		System.out.println("Display: "+ ll);
		System.out.println("Size: "+ll.size());
		System.out.println("Retrive Index at Position 1: "+ll.get(1));
		
		Object element1 =ll.get(0);
		System.out.println("Index 0: " +element1);
		
		ll.add(null);
		ll.add(null);
		
		System.out.println("Display: "+ ll);
		
	
		System.out.println("Remove the Index 0: "+	ll.remove(0));
		System.out.println("Display: "+ ll);
		ll.removeFirst();
		System.out.println("Display: "+ ll);
		System.out.println("Remove the last element: "+ll.removeLast());
		System.out.println("Display: "+ ll);
		
		
		// Loop
		System.out.println();
		System.out.println("Printing with each advance");
		for (Integer number:ll ) {
			System.out.println("   "+number);
		}
		System.out.println("Printing with Iterator");
		
		Iterator i = ll.iterator();
		while (i.hasNext()) {
			System.out.println("   "+i.next());
		}
		
		System.out.println("\nPrinting with for loop!");
		
		for (int x =0; x<ll.size();x++) {
			System.out.println("    "+ll.get(x));
		}
		
		ll.peek();
		ll.pop();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
	}

}
