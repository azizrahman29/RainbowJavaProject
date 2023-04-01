package controlFlow;

public class SwitchExample4 {

	public static void main(String[] args) {
		// Switch is a control flow -- > decision making 
				// switch, case, break, default 
				
				int i = 5; 
				
				switch (i) {
				
				// conditions --> case 
				case 1:
					System.out.println("This is the case 1");
					break; 
					
				case 2:
					System.out.println("This is the case 2");
					break; 
					
					// default --> otherwise / any other conditions / non of the above
					default:
						System.out.println("This is a default case");
				}

				
				String str = "banana";
				
				switch (str) {
				case "orange":
					System.out.println("This is an orange");
					break; 
				case "strawberry":
					System.out.println("This is a strawberry");
					break; 
				case "apple":
					System.out.println("This is an apple");
					break; 
					
				default: 
					System.out.println("This is non of the above fruits");
				}
				
				
				char a = 'A'; 
				switch  (a) {
				case 'B':
					System.out.println("This the character of B");
					break; 
				case 'A':
					System.out.println("This is the chracter of A");
					break;
					
				default:
					System.out.println("Non of the above chracters");
				}
			

	}

}
