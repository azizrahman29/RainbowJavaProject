package polymorphism;

public class TestA {
	
	public static String car (String toyota) {
		return toyota; 
	}
	
	public static String car (String toyota, String Chevy) {
		return "Toyota & Chevy";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2; 
		x = 3; 
		
		
		String car = "Toyota LE" ;
		car = "Dodge" ;
		
		System.out.println(car);
}
}