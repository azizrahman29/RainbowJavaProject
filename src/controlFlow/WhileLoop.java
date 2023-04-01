package controlFlow;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		  while loop --> condition is evaluated first and if it is true, the statement is executed. 
		  when the condition turns false, the control comes out of the loop
		 */
		
		// Initialized 
		int i = 1; // 3< 5
		
		// 1 
		// 2 
		// 3
		
		while (i <= 5) {
			System.out.print(i + " "); // print i 
			i++; // increment +1
		}
		
		// Reverse order
		System.out.println("\n ");
		
		int x = 5; 
		while ( x >= 1) {
			System.out.print(x+ " ");
			x--; 
		}
		
		// printing alphabet characters
		// A B C 
		System.out.println("\n ");
		
		char c = 'A'; 
		while (c <= 'Z') {
			System.out.print(c + " ");
			c++; 
		}
		
		// printing alphabet characters in reverse
				// z y x w 
		System.out.println("\n ");
		
		char ch = 'z'; 
		while (ch >= 'a') {
			System.out.print(ch + " ");
			ch--; 
		}
		
	}

}
