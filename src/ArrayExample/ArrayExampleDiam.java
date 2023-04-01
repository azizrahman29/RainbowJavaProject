package ArrayExample;

import java.util.Arrays;

public class ArrayExampleDiam {

	public static void main(String[] args) {
		/*
		  Array --> container []
		  1. Single Dim : one line / one row
		  2. MultiD: an array inside another array/ one line under another line of the values such as a table
		 */
		
		String [] stringArray = new String [3];
		System.out.println(Arrays.toString(stringArray));
		System.out.println(stringArray.length);
		for(int i = 0; i < stringArray.length; i++) {
			
		}
		
		// Char []
		char [] ch = new char [5];
		System.out.println("ch array: " + Arrays.toString(ch));
		ch [0] = 'P';
		ch [1] = 'A';
		ch [2] = 'C';
		ch [3] = 'D';
		ch [4] = 'E';
		
		// after adding data inside the array
		System.out.println("ch array: " + Arrays.toString(ch));
		
		// for each 
		for (char character : ch) {
			System.out.println(character);
			
		}
		
		System.out.println("\n 2D Array ");
		// 2D 
		
		int multiArray [] [] = {
				
				{0, 0, 0, 0},
				{1, 1, 1, 1},
				{2, 2, 2, 2}
				
		}; 

		for (int row = 0; row < multiArray.length; row++) {
			
			for(int column = 0; column < multiArray[row].length; column++)
			
			System.out.print(" " + multiArray[row][column]);
			// new line 
			System.out.println();
		}
	}

}
