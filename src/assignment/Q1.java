package assignment;

public class Q1 {

	public static void main(String[] args) {
		 /*
		 * Question1: Create a program to check whether an alphabet character is vowel
		 * or consonant using if. . . else statement
		 * 
		 * Hint: Create a variable with char data type, use if.. else statement with the
		 * condition of == and || operators
		 */
		
		char c = 'U'; 
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
			System.out.println(c + " is vowel");
		} else {
			System.out.println(c + " is consonent");
		}

	}

}
