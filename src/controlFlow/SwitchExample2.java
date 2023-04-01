package controlFlow;

public class SwitchExample2 {

	public static void main(String[] args) {
		// 
		
				int number = 40; 
				String tshirtSize; 
				
				switch (number) {
				
				case 28:
					tshirtSize = "Small"; 
					break; 
					
				case 40: 
					System.out.println("The tshirt size is Medium");
					tshirtSize = "Medium"; 
					break; 
					
				case 50:
					tshirtSize = "Large"; 
					break; 
					
				default: 
					tshirtSize = "Unknown" ;
					break; 
					
				}
				
				System.out.println("Actual tshirtSize is: " + tshirtSize);

	}

}
