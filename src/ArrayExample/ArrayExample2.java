package ArrayExample;

import java.util.Arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		// Array: Collection of data which is stored in a list
		
				char a = 'a'; 
				char b = 'b'; 
				char c = 'c';
				char d = 'd';
				
				// Declaring Array
				char [] character = {'a', 'b', 'c', 'd'}; 
				
				// method--> .length : size of the list
				System.out.println("Size: " + character.length);
				
				// print array --> method is coming from utils: Arrays.ToString (name_variable); 
				System.out.println("character: " + Arrays.toString(character));
				
				// printing the array elements 
				// index --> position, location ( 0 1 2 3 4 ) 
				
				// name_varaible [index]
				System.out.println("Element at position 0: " + character[0]);
				System.out.println("Element at position 2: " + character[2]);
				
				// bounds : out of range --> Exception (error)
				//System.out.println("Element at postion 4: " + character [4]);
				
				// for loop to retrieve the data from above array 
				
				for(int i= 0; i < character.length; i++ ) {
					System.out.println(" " + character[i]);
				}
				
				// Another Example 
				System.out.println("\n Array of Integers");
				
				int [] phoneBook = {457851247, 751875245, 854258148}; 
				System.out.println("Size phoneBook: " + phoneBook.length);
				System.out.println("Element at position 2: " + phoneBook[2]);
				
				for(int i = 0; i < phoneBook.length; i++) {
					System.out.println(phoneBook[i]);
				}
				
				// print all elements inside array bracket  [            ]
				System.out.println(Arrays.toString(phoneBook));
	}

}
