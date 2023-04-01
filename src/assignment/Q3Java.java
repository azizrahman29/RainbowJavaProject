package assignment;

public class Q3Java {

	public static void main(String[] args) {
		/*
		 * Question3: Create a program to calculate the sum of natural numbers using
		 * while loop.
		 * 
		 * Hint: Create 3 variables with int data type and check your condition of the
		 * first 2 variables, if the condition is true should store the sum and
		 * increment.
		 */
		
		int count = 4; 
		int number = 1; 
		
		// 1 + 2 + 3 + 4
		int sum = 0; 
		
		while (number <= count) {
			// 1 + 2 + 3 + 4
			sum += number; 
			number++;
		}
		
		System.out.println("Sum: " + sum );

	}

}
