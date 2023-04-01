package controlFlow;

public class LoopExampleVariable {

	public static void main(String[] args) {
		// 1+ 2 +3 +4 +5 +6 +7 +8+ 9+ 10 = 55

		// sum your numbers

		int sum = 0;

		int number = 10;

		// for loop to check the initialExpression and update it with checking the
		// condition

		for (int i = 1; i <= number; i++) {
			// sum all above numbers
			
			sum += i; // sum = sum + i ;
			//System.out.println("Sum: " + sum);
		}
		System.out.println("Sum: " + sum);

	
	}

}
