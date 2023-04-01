package exercise;

public class MainMethod {

	static void lastName(String firstName) {
		System.out.println(firstName + " Khan");
		
		
	}
	
	public static void main(String[] args) {
		
		lastName("Ali");
		lastName("Aziz");
		System.out.println();
		for (int i = 1 ; i<= 5; i++) {
			lastName ("Aamir");
		}
	}
}


