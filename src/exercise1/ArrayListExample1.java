package exercise1;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		
		//int array [] = new int [5];
	//	array[3]=5;
	//	System.out.println(array[4]);

		
		ArrayList <String> arrayList = new ArrayList<String>();
		System.out.println("ArrayList: " + arrayList);
		
		arrayList.add("Ali");
		arrayList.add("Aziz");
		
		
		System.out.println(arrayList);
		
		arrayList.set(0, "Ahmad");
		System.out.println("Seted: " +arrayList);
		
		arrayList.add("Abas");
		System.out.println(arrayList);
	}

}
