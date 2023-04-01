package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListLoops {

	public static void main(String[] args) {
		// Integers 
		
		ArrayList <Integer> num = new ArrayList <Integer>();
		System.out.println("Size: " + num.size()); // 0 
		
		num.add(2); 
		num.add(5);
		num.add(3);
		num.add(8);
		num.add(1);
		num.add(4);
		
		System.out.println("Size: " + num.size()); //6
		
		System.out.println("Number in a List: " + num);
		System.out.println("Position:  " +num.get(0));
		Collections.sort(num);
		System.out.println("Sorted: " +num);
		
		Collections.reverse(num);// DESC
		System.out.println("Descending: " +num);
		
		Collections.reverse(num);// ASC 
		System.out.println("Ascending: " +num);
		//Loops
		
		// 1. for loop
		System.out.println("\nFor Loop");
		
		for(int i = 0; i <num.size(); i++) {// .size --> length
			System.out.println("	" + num.get(i));
		}
		
		// 2. for each 
		System.out.println("\nAdvanced Loop");
		
		for(Integer number : num) {
			System.out.println("	"+number);
		}
		
		// 3. While Loop 
		System.out.println("\nWhile Loop");
		
		int counter = 0; // 2 > 0 --> Yes
		while(num.size() > counter) {
			// num.get (1)
			System.out.println("	" + num.get(counter));
			counter++; 
		}
		
		// 4. Iterator --> .hasNext: get the element | .next to print the element
		System.out.println("Iterator Looping");
		
		Iterator i = num.iterator();
		
		while(i.hasNext()) {
			System.out.println("	" + i.next());
		}
		
		// remove
		num.remove(0); // index 
		System.out.println("Removed at 1st position: " +num);
		
		// set 
		num.set(0, 7);
		System.out.println("Replaced 2 with 7: " +num);
		
		// add as index not replacing
		num.add(0, 1);
		System.out.println("Shift 7 to 1st: " +num);
		
		// Copying element to another list 
		
		ArrayList <Integer> n = new ArrayList<Integer>() ;
		n.add(null);
		n.add(null);
		System.out.println("Displaying n list: " +n);
		
		// copying the old elements to new n list
		n.addAll(num);
		System.out.println("Displaying n list: " +n);
		
		
	}

}
