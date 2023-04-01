package controlFlow;

public class ForLoopWithStringExample {

	public static void main(String[] args) {
	// for loop with String 
		
		String text = "Hello"; 
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("text: " +text);
		}
		
		System.out.println("\n\n  Another example");
		// Another Example with String
		
		String str = "Hello"; 
		
//		System.out.println(str.toUpperCase());
		System.out.println("str lenght: " + str.length());
//		
		System.out.println("H: "+ str.charAt(0));
		
		
		/// 
		
		System.out.println("\n");
		
		for (int i = 0 ; i < str.length(); i++ ) {
			//System.out.println("Str: " +str);
			
			System.out.println("Character: " + str.charAt(i));
		}

	}

}
