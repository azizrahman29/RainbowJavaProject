package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> arrayList = new ArrayList <String> ();
		System.out.println(arrayList);

		arrayList.add("Jack");
		
		arrayList.add("Mick");
		arrayList.add("John");
		
		System.out.println("Display: " +arrayList);
		
		arrayList.add("Alex");
		System.out.println("\nAfter Adding: "+arrayList);


		
		arrayList.set(2, "Tom");
		System.out.println("Setting:  "+arrayList);
		
		 for (String list: arrayList) {
			 System.out.println("\n Display with for each: "+arrayList);
			 
			
			 
			
		 }
		 
		 
		 
		 
		 
		 
		 
}
}