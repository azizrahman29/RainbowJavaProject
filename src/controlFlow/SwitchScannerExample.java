package controlFlow;

import java.util.Scanner;

public class SwitchScannerExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hey! Guess a number from 1 to 100 to win a prize!!!!");

		int number = s.nextInt();
		
		switch (number) {
		case 54:
			System.out.println("You have won a prize of $100.00 ");
			break;
		case 21:
			System.out.println("Congrat! You have earned 100% discount! ");
			break;

		default:
			System.out.println("Sorry! You didnt guess the right number.");
		}

	}

}
