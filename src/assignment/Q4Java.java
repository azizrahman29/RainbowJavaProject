package assignment;

public class Q4Java {

	public static void main(String[] args) {
		/*
		 * Question4: Create a program to generate the Multiplication Table using for
		 * loop and print the result as canvas in assignment 2.
		 * 
		 * Hint: Create an int data type with value 9, use for loop to loop on that
		 * number with the number of count 10 and printf to format your table.
		 */
		
		int number = 9; 
		for (int i = 1; i <= 10; i++) {
			
			// the format or printf take two argument " ", variables 
			// 9 * 1 = 9 
			// 9 * 2 = 18
			
			System.out.printf("%d * %d = %d \n", number , i, number * i);
		}

	}

}
