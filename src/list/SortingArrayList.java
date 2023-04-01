package list;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		// ArrayList of Integers

		ArrayList<Integer> number = new ArrayList<Integer>();
		System.out.println("Display: " +number); // [ ]
		System.out.println("Size: " +number.size()); // 0
		
		number.add(5); 
		number.add(2);
		number.add(3);
		number.add(1);
		number.add(6);
		
		System.out.println("Display: " +number);
		
		// Sort
		number.add(4); 
		Collections.sort(number);// Ascending ASC 
		System.out.println("Ascending order: " +number);
		
		//number.add(4); 
		//System.out.println("Sorted List: " +number);
		
		// Loop
		for(Integer num : number) {
			System.out.println("Number: " +num);
		}
		
		// Sort --> Descending DESC
		Collections.sort(number, Collections.reverseOrder());
		System.out.println("Descending order: "+number);
		
		number.add(2); // last index
		System.out.println("Display: " +number);
		
		Collections.reverse(number);// ASC / DESC
		System.out.println("Descending order: "+number);
		
		Collections.sort(number);// Default Sort--> Ascending A - Z | 1 - 10
		System.out.println("Sorted: " +number);
	}

}
