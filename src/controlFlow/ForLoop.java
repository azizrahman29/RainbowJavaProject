package controlFlow;

public class ForLoop {

	public static void main(String[] args) {
	// for loop
		
		/*
		  initialExpression --> initial variable 
		  int i = 1;
		  
		  
		  i <= 5;
		  Condition -- > true : run multiple times until to make it false
		  
		  i++
		  updateExpression --> a must to update your expression ( increment ++ and decrement -- )
		 */
		
		// initialize a variable with a value 
	
		
		//  5 <= 5 --> YES
		
	
		
		//
		for (int i = 1;  i <= 5; i++) {
			System.out.println("Loop: " + i); 
			
			/// loop : 1
			// loop  : 2
			// loop : 3 
			// loop: 4
			// loop : 5
		}
		System.out.println("\n This is another example");
		
		int x = 0; 
		
		for (x = 8; x < 10; x++) {
			System.out.println("x value: " + x);
		}
		
		System.out.println("\n Another example ");
		
		// 1 = 1 
		for(int j = 5; j >= 1; j--) {
			System.out.println("J Value: " +j);
		}
		
	}

}
