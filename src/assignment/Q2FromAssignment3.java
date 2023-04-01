package assignment;

public class Q2FromAssignment3 {

	public static void main(String[] args) {
		/*
		 * Create a program to convert the below String to char and print each letter
		 * based index position.
		 * 
		 * Requirement:
		 * 
		 * String is "December" Use for loop for iteration Use String method for each
		 * character at position Iterate and print each character individually
		 */
		
		String month = "December"; 
		System.out.println("Month of the year: " + month);
		
		// length 
		System.out.println("Lenght of the month: "+month.length());
		
		// char at position
		// month.charAt(2)
		
		System.out.println("Character at position 0: " + month.charAt(0));
		
		// new line
		System.out.println();
	
		
		// iterate --> for loop 
		for(int i = 0; i <= month.length() - 1; i++) {
			char character = month.charAt(i);
			System.out.println("Character at " + i + " position " + character);
		}
		

	}

}
