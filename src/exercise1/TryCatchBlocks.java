package exercise1;

public class TryCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 , n2;
		try {
			
			n1 = 0;
			n2 =10/n1;
			System.out.println("n2: "+n2);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("you can't devide any number by zero!");
		}
	}

}
