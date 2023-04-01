package basic;

import java.util.Scanner;

public class Question3FromAssignment {

	public static void main(String[] args) {
		/*
		 Write a program to read two integer and print the multiplication of those integer.
		Hint: Use Scanner, .nextInt(); and assign multiplication of two integer to third variable
		 */
		
		// Scanner Class
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your first integer number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter your second integer number");
		int n2 = scanner.nextInt();
		
		// Closing the Scanner class
		scanner.close();
		
		int n3 = n1 * n2; 
		System.out.println("Result of n1 multiply n2: " + n3);

	

	}

}
