package controlFlow;

public class RevisionControlFlow {

	public static void main(String[] args) {
		// Control Flow
		
				// if statement, switch
				
				int x = 10; 
//				if (x == 1) {
//					System.out.println(x + " is equal");
//				} else {
//					System.out.println(x + " is not equal");
//				}
//				
				// switch
//				switch (x) {
//				case 10:
//					System.out.println(x + " is equal");
//					break; 
//				case 11: 
//					System.out.println(x + " is not equal");
//					break; 
//				default:
//					System.out.println("x is not in the range");
//				}
//				
				// for, while, do while 
				
				// for --> know the count use the for loop
				for(int i = 0; i< 5; i++) {
				System.out.println("i: " + i);
				}
				// new line 
				System.out.println("\n");
				
				for(int j = 5; j >= 1; j--) {
					System.out.println("j: " +j);
				}

				// new line 
				System.out.println("\n");
				// while 
				
				char character = 'A'; 
				
				while (character <= 'Z' ) {
					System.out.print(character + " ");
					character++; // increment the value
				}
				
				// new line 
						System.out.println("\n");
				// do while 
				
				char c = 'z'; 
				do {
					System.out.print(c + " ");
					c--;
				} while (c >= 'a'); 
				
				System.out.println("\n");
				// nested for loop --> a loop inside another loop
				
				// type for and press ctrl + space
				
				// outer loop
				for (int i = 1; i <= 10; i++) {
					// print the number
					System.out.println("Table of: " + i);
					
					// inner loop
					for (int j = 1; j <= 10; j++) {
						
						// print the values 
						System.out.print(" " + (i*j));
						
					}
					System.out.println();
					
				}
		
		

	}

}
