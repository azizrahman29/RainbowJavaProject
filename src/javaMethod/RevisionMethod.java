package javaMethod;

public class RevisionMethod {
	
	// Method: method is a task -- > 1. System defined method  2. User defined Method 
	
	// 1. Function, string class .toUpercase(), .length(), .pow
	// 2. void--> nothing, return --> return the data type value 
	// Method calling --> you take your signature of method and add your values inside the (); 
	// Signature method --> name of the method and the parameters like: nameMethod(int x, int y)
	// Access modifiers: default, public, private, protected

	
	// creating a void method
	public static void voidMethod() {
		System.out.println("Here voidMethod is called! ");
	}
	
	// Return type: is used with data type and return reserved keyword in body of the method 
	public static String returnMethod() {
		
		// you can directly use the return/ or use the operations (recursions) 
		return "Here returnMethod is called! "; 
	}

	// main method : System defined
	public static void main(String[] args) {// is mandatory to call your methods/ print anything
		// to call voidMethod
		voidMethod(); 
		
		// to call your returnMethod
		String returnText = returnMethod();
		System.out.println(returnText);
		
		System.out.println(returnMethod());

	}

}
