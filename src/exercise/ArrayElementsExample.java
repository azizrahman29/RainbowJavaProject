package exercise;

import java.util.Scanner;

public class ArrayElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int [] array = new int [5];
		
		int sum = 0;
		
		System.out.println("You can enter an array element size of 5 indexes! ");
		
		for (int i = 0 ; i< 5 ; i++) {
			
			array[i] = scan.nextInt();
			
		}
		
		for (int number: array) {
			sum = sum + number;
			
		}
		
		System.out.println("Sum of array elements: "+sum);
	}

}
