package javaMethod;

public class ExampleMethod {

	
		// main method
		public static void main(String[] args) {
			// Create an object of your class for your method inside your main method
			
			ReturnTypeMethod obj = new ReturnTypeMethod();
			System.out.println("Result of multiplication " + obj.multiply(5, 2));

		}
		
		// not static 
		
		int multiplication; 
		
		// name of method --> multiply
		public int multiply (int x, int y) {
			
		 multiplication = x * y;
		 
		 // 
		 return multiplication;

	}

}
