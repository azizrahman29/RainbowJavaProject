package list;

import java.util.ArrayList;// class
import java.util.List; // interface 

public class ArrayListExample {

	public static void main(String[] args) {
		// Collection Framework : set of classes, and set of interfaces
		
		
//		int array [] = new int [5]; //  1 2 3 4 5
//		array [4] = 5; 
//		System.out.println(array[5]);
		
		// Interface --> List 
		//List <String> list = new ArrayList <String> (); // Abstraction = implementor 
		
		//Class --> ArrayList
		
		// ArrayList is resize-able, it accept duplicates, homogeneous (same) data structure, change the index
		ArrayList <String> arrayList = new ArrayList <String> ();
		System.out.println("Array List: " +arrayList);
		
		// collection: classes provides methods to implement our design
		arrayList.add("Rene"); 
		arrayList.add("Mike");
		arrayList.add("Sara");
		arrayList.add("Rene");
		arrayList.add("Rene");
		//display
		System.out.println("Names: " + arrayList);
		
		// adding element on index position 
		arrayList.add(0, "Tom");
		System.out.println("Names: " + arrayList);
		
		// set value 
		arrayList.set(5, "Jon"); 
		System.out.println("Names: " + arrayList);
		
		/* Map:  group that has key value pair is called map
		  key1 = az; 
		  value1 = arizona; 
		  
		 Set: toyota, chevy, bmvw
		  
		  List: toyota le 1, toyota, chevy, bmvw
		 */

	}
}
