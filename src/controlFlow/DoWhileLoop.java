package controlFlow;

public class DoWhileLoop {

	public static void main(String[] args) {
		// do while -- > execute the statement first, and then evaluate the condition if it is true/false
		
				do {
					System.out.println("let's play football");
				} while (false);

				// another example
				System.out.println("\n Another Example of do while");
				
				int i = 5; // decrement 
				
				do {
					System.out.println("i: "+i);
					i--; 
				} while (i >= 1);
				
				
				// 
				System.out.println(" Printing alphabets in do while ");
				
				char c = 't'; 
				do {
					System.out.print(c + " ");
					c++; 
				} while (c <= 'z');
				
				// 
				System.out.println("\n another example");
				
				int j = 1; 
//				do {
//					System.out.print(j + " ");
//					j+2; 
//				} while (j <=10);
				
				while (j <= 10) {
					System.out.println(j = 5);
					break;
				} 
	}

}
