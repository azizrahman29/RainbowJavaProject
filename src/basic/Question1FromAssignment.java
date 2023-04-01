package basic;

import java.util.Scanner;

public class Question1FromAssignment {

	public static void main(String[] args) {
		/*
		 Create a program using Scanner Class to capture the user input that can get the values of both numbers 
		 from user. The program that you create should calculates the sum of both numbers and displays it.
		 Hint: use, 3 variables, naming num1, num2, and sum with the help of Scanner Class and use .nextInt();
		 */
		
		int number1;
		int number2; 
		int sum; 
		
		Scanner scan = new Scanner (System.in); 
		System.out.println("Please enter your First Number");
		number1 = scan.nextInt();
		
		System.out.println("Please enter your Second Number");
		number2 = scan.nextInt();
		
		// method to close the Scanner .close
		scan.close();
		
		sum = number1 + number2; 
		System.out.println("The sum of above numbers are: " + sum);
	}

}
