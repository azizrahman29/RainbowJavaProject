package controlFlow;

public class SwitchExpample {

	public static void main(String[] args) {
		
		// Switch, case, break , default

		// Switch is used for control flow decision making (multi conditions)
		// true means print and get out of the scope
		// false means argue and check the conditions
		
		// switch statement is similar to if else if ladder 

		// Enter from 1 to 7 to check the days of the week
		// 
		
		int day = 7;
		switch (day) {

		// reserved word --> case (condition)

		case 1:
			System.out.println("Today is Monday!");
			break; // get out of the condition
			
		case 2:
			System.out.println("Today is Tuesday!");
			break; 
			
		case 3:
			System.out.println("Today is Wednesday!");
			break; 
			
		case 4:
			System.out.println("Today is Thursday!");
			break; 
			
		case 5:
			System.out.println("Today is Friday!");
			break; 
			
			// reserved key word --> default (not any above condition)
		default: 
			System.out.println("It is Weekend!");
	}

}
}