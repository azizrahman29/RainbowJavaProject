package controlFlow;

public class MoreLoopExample {

	public static void main(String[] args) {
	//Loop: number of times that a statement get print
		
		// code redundancy
		
		
		// Loop: for loop --> we know the number of times to execute our code block
		
		// InitialExpressio --> data type + varaible_name = value; 
		// Condition --> comparison operator (>, < , >=, <=, ==)  
		// UpdateExpression --> increment ++,  decrement -- (unary operators) 
		
		
		for (int x = 1; x < 5; x++ ) { //  <= 5
		
		     System.out.println("I love Football!");
		}
		
		// 
		System.out.println("\n\t Another Example");
		
		for(int i = 10; i <= 15; i++) {
			System.out.println("Value i: " +i);
		}
		
		// An example with characters - for loop 
		System.out.println("\n\t Another Example with character");
		
		for (char c = 'T'; c <= 'Z'; c++ ) {
			System.out.print(c + "  ");
		}
		
		// Another example 
		
		System.out.println("\n");
		
		int j; 
		for (j = 1; j <= 4; j++) {
			System.out.println("j: " +j);// infinity loop --> running  0 <= 3 
		}
		
		// If i want to print in a reverse order --> decrement -- 
		
		System.out.println("\n Print 5 to 1 ");
		
		for (int i = 5; i >= 1; i--) {
			System.out.println("i: " +i);
		}
		
		// Another example 
		System.out.println("\n Printing from Z to A");
		
		for (char ch = 'Z'; ch >= 'A'; ch--) {
			System.out.print(ch + " ");
		}
	}

}
