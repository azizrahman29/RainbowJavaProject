package constructor;

public class ArgsConstructor {

	// fields
		String name; 
		int id; 
		
		// Parameterized Constructor Class_Name(data_type variable_name)
		// special block of the code  
		ArgsConstructor (String name, int id){
			
			// Get the fields and assign it the parameters
			// this. --> point on fields/variables, methods, constructor
			this.name = name; 
			this.id = id; 
			
		}
		
		// main method 
		public static void main(String[] args) {
			
			// calling the constructor
			ArgsConstructor student = new ArgsConstructor ("Jon Duo", 105); // dummy data / fake data 
			System.out.println("Name: " + student.name + "   ID: " + student.id);
}
}