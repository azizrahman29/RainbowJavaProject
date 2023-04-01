package controlFlow;

public class NestedInLoop {

	public static void main(String[] args) {
		// Nested for loop
				// one loop inside another loop

				// outer loop -- > table name 
				for (int i = 1; i <= 3; i++) {
					
					// inner loop --> rows 
					for(int j = 1; j <= 3; j++) {
						//System.out.println("i: " +i);
						//System.out.println("j: " +j);
						
						System.out.println("i: "+i +"   j: " +j);
					}
				}
				
				
				// Another example 
				/*
				     
				     *
				     * *
				     * * *
				     * * * *
				     * * * * *
				     
				 */
				System.out.println("\n Another Example");
				
				for (int i = 1; i <=5; i++) {
					for(int j = 1; j<= i; j++) {
						System.out.print(" *");
					}
					// new line
					System.out.println();
				}
				
				// Table of multiplication 
				
				/*
				  
				  1 2 3 4 5 6 7 8 9 10 
				  2 4 6 8 10 12 14 16 18 20 
				  3 6 9 12 
				  4 8 12 16 
				  5 
				 */
				
				System.out.println("\n \t Table of Mulitiplication ");
				
				for (int y = 1;  y <= 10; y++) {
					
					for (int x = 1; x <= 10; x++) {
						System.out.printf("%5d" , x * y);
					}
					// print a new line 
					System.out.println();
				}

	}

}
