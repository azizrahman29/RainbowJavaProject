package controlFlow;

public class ForLoopRevesion {

	public static void main(String[] args) {
		/* for loop --> if know that how many times we want to run our body of block
		 
		  Initialize Expression 
		  Condition 
		  Update Expression --> decrement/increment
		   
		*/
	 
		for(int i = 5; i >= 1; i-- ) {
			
			// this print first and then increment/decrement happens
			System.out.print( i + " ");
		}
		
		System.out.println("\n");
		
		
		
		// for --> press ctrl + space
		
		String word = "word" ;
		// word.length();
		System.out.println("Length of word: " + word.length());
		
		for (int i = 0; i < word.length(); i++) {
			// method .charAt()
			System.out.println("char: " + word.charAt(i));
		}
		
		System.out.println("\n Another Example ");
		
		System.out.println("\n Mutiliplication Table");
		
		// initialize a variable 
		
		// 5 * 1 = 5 
		// 5 * 2 = 10 
		int number = 8; 
		for(int i = 1; i <= 10; i++) { // number * i 
			System.out.printf(" %d * %d = %d \n", number , i ,  number * i );
		}
		
		System.out.println("\n An interview question ");
		
		System.out.println(" Fibonacci Series");
		// 0 1 1 2 3 5 8 --> the addition of two precedent number is a fibonacci number
		
		// number1 + number2 = sum
		
		int number1 = 0; 
		int number2 = 1;
		int count = 20; 
		
		for (int i = 1; i <= count; i++) {
			
			System.out.print(number1 + " ");
			
			int sum = number1 + number2; 
			number1 = number2; 
			number2 = sum; 
		}
		
		// pattern
		// nested loop: two/ more loops
		// outer loop --> column 
		// inner loop --> rows 
		System.out.println("\n Pyramid patterns ");
		System.out.println();
		
		int p = 6; 
		
		// outer loop
		for(int i = 1; i <= p; i++ ) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			// new line 
			System.out.println("");
		}
		
		
		/// another example 
		System.out.println("\n Reverse Pattern ");
		
		
		for(int i = 1; i <= 6; i++ ) {
			// inner loop
			for (int j = 6; j >= i; j--) {
				System.out.print(" *");
			}
			// new line 
			System.out.println("");
		}
	}

}
