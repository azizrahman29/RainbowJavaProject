package controlFlow;

public class Continue {

	public static void main(String[] args) {
		// Continue -- > in skipping the condition and continuing the loop
		
				for (int i = 1; i <=10; i++) {
					// if statements 
					
					if (i == 7) {
						// continue statement
						continue; 
					}
					
					System.out.println("count: " + i);
				}
	}

}
