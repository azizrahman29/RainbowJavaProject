package exercise;

public class MethodAddition {
	
	public int addNumbers (int x , int y ) {
		int addition= x+y;
		return addition;
		
		
	}

	public static void main(String[] args) {
		int i = 10;
		int j = 12;
		 MethodAddition num = new MethodAddition();
		 int result = num.addNumbers(i, j);
		 System.out.println("Sum of X + Y = " + result);
		 
		
	}

}
