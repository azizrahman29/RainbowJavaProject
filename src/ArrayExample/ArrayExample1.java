package ArrayExample;

import java.util.Arrays;

public class ArrayExample1 {

	public static void main(String[] args) {
		// Array: means collections of data (cue, order, list, collection) 
		
				// syntax we use for array
				// dataType [] variable = new dataType [3]; 
				
				// declaring array
				String [] array1 = new String [3]; 
				char [] array2; 
				int [] array3; 
				boolean [] array4; 
				
				// initialize arrays
				array2 = new char [3];
				array3 = new int [4];
				array4 = new boolean [2];
				
				// inserting element (objects)
				
				// String 
				array1 [0] = "Ahmad";
				array1 [2] = "John";
				array1 [2] = "Sara"; 
				
				// char 
				array2 [0] = 'A' ;
				array2 [0] = 'B';
				array2 [2] = 'C'; 
				
				// direct initialization
				String [] name = {"Jim", "Rene", "Mike", "John"};
				int [] number = {1, 2, 3 , 4 }; 
				
				// printing the length (size)
				// method .lenght --> size of array
				
				// String name 
				System.out.println("Size of array name: " + name.length);
				
				// char array2 
				System.out.println("Size of char array2: " + array2.length);
				
				// print the actual element that you stored
				// Arrays.ToString (nameOfTheVaraible);
				
				//printing String name 
				System.out.println("Array name: " + Arrays.toString(name));
				
				// int array number
				System.out.println("Array number: " + Arrays.toString(number));
				
				// reducing the number of variables
				String car1 = "Toyota" ;
				String car2 = "Chevorlate";
				String car3 = "Toyota LE";
				
				// Store this in array
				String [] car = {"Toyota", "Chevorlate", "Toyota LE" }; 
				
				// initialization with size
				String [] cars = new String [3] ;
				cars [2] = "Toyota LE";
				
				// several objects [ 1, "Ahmad", 'X'] 
				Object [] ob = {1, "Ahmad", 'X'}; 
				
	}

}
