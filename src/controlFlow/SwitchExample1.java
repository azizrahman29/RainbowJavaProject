package controlFlow;

public class SwitchExample1 {

	public static void main(String[] args) {
		// Switch Example with Char 
		
				char grade = 'T';
				
				
				switch (grade) {
				case 'A' :
					System.out.println("Marks: Excellent");
					break;
					
				case 'B' : 
					System.out.println("Marks: Good");
					break; 
					
				case 'C' : 
					System.out.println("Marks: Fair");
					break; 
					
				default: 
					System.out.println("Marks: Need improvement");
				}

	}

}
