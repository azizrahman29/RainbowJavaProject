package ArrayExample;

public class ArrayExampleDuplicate {

	public static void main(String[] args) {
		// find the duplicate of the below array integers
		
				int [] number = {4, 5, 6, 9, 5, 4, 8, 6, 3, 2}; 
				
				// nested for loop 
				for (int i = 0; i < number.length; i++) {
					// inner loop
					
					// increasing the i with 1 to check the position of the element
					for(int j = i + 1; j < number.length; j++) {
						
						// checking the condition if they are equal to print the duplicate element
						if (number [i] == number [j]) {
							System.out.println(number[j]);
						}
						
					}
				}

	}

}
