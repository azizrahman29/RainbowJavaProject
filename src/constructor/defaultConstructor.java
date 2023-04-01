package constructor;

public class defaultConstructor {

	
	// default constructor: there is no class Name constructor inside the design
	// the class automatically create a constructor thats why known as default constructor
	
	int x ;
	boolean b ;
	// Main
	
	public static void main(String[] args) {
		// creating an object of the class to define the default constructor
		
		defaultConstructor obj = new defaultConstructor();
		
		
		System.out.println("X: " + obj.x);
		
		System.out.println("boolean: " +obj.b);
		
	}
}
