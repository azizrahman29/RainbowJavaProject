package assignment;

public class Q2Java {

	public static void main(String[] args) {
		/*
		 * Question2: Create a program to check whether an alphabet character is vowel
		 * or consonant using switch statement
		 * 
		 * Hint: Create a variable with char data type, use switch statement with the
		 * cases if they are vowel, else break it and print the default statement.
		 */

		char character = 'i';
		switch (character) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(character + " is vowel");
			break; 
		default:
			System.out.println(character + " is not a vowel charater");
		}
	}

}
