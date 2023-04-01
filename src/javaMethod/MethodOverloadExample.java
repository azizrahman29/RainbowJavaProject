package javaMethod;

public class MethodOverloadExample {
	
	// Method Overloading: use the name of the method and increase the number of  parameters inside the function
	
	public static void add (int a, int b) {
		System.out.println("This is an addition of a & b");
		int addition1 = a + b; 
		System.out.println("\nAddition1 of a & b: " + addition1);
	}
	
	// overload the above method 
	public static void add (int a, int b, int c) {
		int addition2 = a + b + c; 
		System.out.println("\nAddition2 of a, b & c: " + addition2);
	}
	
	// Overload with different data type
	public static void add (double a, double b) {
		double additionDouble = a + b; 
		System.out.println("\nD - Addition of a & b: " + additionDouble);
	}
	
	// main method
	public static void main(String[] args) {
		
		// call the method overloading 
		add(4, 5);
		
		// call the method via className
		MethodOverloadExample.add(1, 2, 3);
		
		MethodOverloadExample.add(5.9, 3.7);
		
		// create an object is also another option to print 
		
		MethodOverloadExample m = new MethodOverloadExample();
		m.add(9, 5);

	}

}
