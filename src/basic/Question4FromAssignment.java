package basic;

import java.util.Scanner;

public class Question4FromAssignment {

	public static void main(String[] args) {
		/*
		 Write a program to calculate the simple interest from the user input using the below formula

			Interest Formula = (P * R * T) / 100

			P is Principal amount

			R is rate per annum

			T is time in years

			Hint: Use a data type to store fractional numbers and create a separate variable to take and 
			calculate the simple interest rate
		 */
		// float p; 
		
		double p; 
		double r; 
		double t; 
		
		// Simple Interest Rate
		double simpleInterestRate; 
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Please enter the Principal amount"); 
		p = sc.nextDouble();
		
		System.out.println("Please pick the Rate of interest");
		r = sc.nextDouble();
		
		System.out.println("Please enter the Time period");
		t = sc.nextDouble();
		
		
		// Interest Formula
		simpleInterestRate = (p * r * t) / 100 ; 
		System.out.println("Simple Interest Rate: " +simpleInterestRate);

	}

}
