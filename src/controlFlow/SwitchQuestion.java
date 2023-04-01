package controlFlow;

public class SwitchQuestion {

	public static void main(String[] args) {
		// Question: what does the program print in a switch statement? 
		
		int number = 5; 
		
		//      5 * 5 + 30 = 30
		switch (number * 5 + number){// condition
		
		case 20: 
			System.out.println("The value is: 20");
			break; 
			
		case 40: 
			System.out.println("The value is: 40" );
			break; 
			
		case 60: 
			System.out.println("The value is: 60");
			break; 
			
		default: 
			System.out.println("Default value is: Default");
			
		}
		System.out.println(number);
	}

	}


