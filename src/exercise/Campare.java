package exercise;

import java.util.Scanner;

public class Campare {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter the first String! ");
		
		String str1 = scan.next();
		System.out.println("Please Enter the second String! ");
		
	String str2 = scan.next();
	
	campareString(str1,str2);
	
	}
	public static void campareString(String str1 , String str2) {
		
		if (str1.compareTo(str2)==0) {
			
			System.out.println("The above entered String are equal! ");
			
			
		}else {
			System.out.println("The above entered String are Not equal!");
		}
	}

}
