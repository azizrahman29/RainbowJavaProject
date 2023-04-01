package exercise;

public class ReturnType {

	
	
	
	
	
	
	public static void main(String[] args) {
		
		ReturnType obj = new ReturnType();
		
		System.out.println(obj.multiply(3, 4));

	}
	int multiplication;

	public int multiply(int x , int y) {
		
		 multiplication = x*y;
		 return multiplication;
	}
}
