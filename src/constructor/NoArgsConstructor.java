package constructor;

public class NoArgsConstructor {
	// data members / fields
		int x; 
		
		// Constructor with no argument
		
		NoArgsConstructor (){
			x = 3; 
			x *= x; // re-initialize and added back to x
			System.out.println("No Args Constructor is called!");
		}
		
		// main method 
		public static void main(String[] args) {
			// calling the constructor 
			NoArgsConstructor obj = new NoArgsConstructor();
			System.out.println("x: " + obj.x );
			
			// calling the print line 
			new NoArgsConstructor();
			new NoArgsConstructor();
			NoArgsConstructor obj1 = new NoArgsConstructor();
			NoArgsConstructor obj2 = new NoArgsConstructor();
	
		}

}
