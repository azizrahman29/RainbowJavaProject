package list;

import java.util.ArrayList; // java utility package 
import java.util.Collections;

public class ArrList {

	public static void main(String[] args) {
		// Array List: It is extends the List interface, dynamic, resize-able, group of elements, duplicates elements
		//            shift to the right/left, accept null values, flexibility, performance, maintains the insertion, random access
		
		ArrayList <String> aList = new ArrayList <String>(); 
		
		System.out.println("Displaying: " +aList); // [ ] 
		System.out.println("Lenght: "+aList.size());
		
		//.add 
		aList.add("Tim"); // element 
		aList.add("Jon");
		aList.add("Sara");
		aList.add("Dhruv");
		System.out.println("Displaying: " +aList);
		
		// add at index position
		aList.add(0,"Erika");
		System.out.println("Displaying: " +aList);
		
		aList.add(4, "Tim");// 4 index 
		System.out.println("Displaying: " +aList);
		
		// Null
		aList.add(null); 
		System.out.println("Displaying: " +aList);
		
		// set element --> replacing the element
		aList.set(0, "Jim"); 
		System.out.println("Displaying: " +aList);
		
		// remove --> index 
		aList.remove(0);
		System.out.println("Displaying: " +aList);
		
		aList.remove(3); // Tim
		System.out.println("Displaying: " +aList);
		
		aList.remove("Tim");
		System.out.println("Displaying: " +aList);
		
		aList.remove(null);
		System.out.println("Displaying: " +aList);
		
		//iterating ArrayList with for-each 
		for(String list : aList) {
			System.out.println("Name: " +list);
		}
		
		// add
		aList.add("Ahmad"); 
		
		System.out.println("Displaying: " +aList);
		for(String list : aList) {
			System.out.println("Name: " +list);
		}
		
		// remove
		aList.remove(3); 
		System.out.println("Displaying: "+aList);
		for(String list : aList) {
			System.out.println("Name: " +list);
		}
		
		//sort list --> Collections.sort
		Collections.sort(aList);
		System.out.println("Displaying: "+aList);
		
		
		// random access --> .get to display the index 
		System.out.println("Random Access: " +aList.get(2));
		
	}

}
