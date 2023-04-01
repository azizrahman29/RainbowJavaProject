package basic;

import java.util.Scanner;

public class Question2FromAssignment {

	public static void main(String[] args) {
		
		/*
	 	Write a program to check Even and Odd numbers while the user input adding the numbers to the console.
		Hint: Assign a int variable to num, use Scanner and .nextInt();

		The input provided by user is stored in num
		Use if else  If the number is divisible by 2 then it's an even number else odd number
	 */
	
	int number;
	
	//Scanner
	System.out.println("Write an integer number to check if it is Even or Odd.");
	Scanner s = new Scanner(System.in);
	number = s.nextInt();
	
	// if else to check even/ odd number
	if (number % 2 == 0) { // true   10 % 2 == ? 
		System.out.println("The number you've entered is " + number + " which is Even number" );
	} else {
		System.out.println("The number you've entered is "  + number + " which is Odd number");
	}
	}
}
