package assignment;

import java.util.Scanner;

public class Q02A5 {

	/*
	 * Question 2: Write a Java method to compare two Strings.
	 * 
	 * Requirements: The program should contain void method with a condition of if
	 * else statement. Feel free if you want to combine it with Scanner to ask the
	 * user to enter the two Strings. You must call the method to compare it.
	 */

	public static void compareString (String str1, String str2) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please Enter your first String");
		
		String str1 = scan.next();
		
		System.out.println("Please Enter your second String");
		
		String str2 = scan.next();
		
		if (str1.compareTo(str2)==0) {
			
			System.out.println("Str1 & Str2 are equal !");
			
		}else { 
			System.out.println("Str1 & Str2 are not equal !");
			
			
		
		}
	}
}
