package exercise;

public class methodOfJava {

	public static void add(int a, int b) {
		int addition1 = a+b;
		System.out.println("Addition of a & b :"+ addition1);
	}
		
		public static void add (int a , int b , int c) {
			
			int addition2 =  a+ b + c;
			
			System.out.println("Addition of a & b :" + addition2);
		}
		
		public  static void add(double a , double b) {
			
			double additionDouble =a + b;
			
			System.out.println("D - Addition of a & b  :"+ additionDouble);
	
		
	}

		
		public static void main(String[] args) {
			
			methodOfJava.add(1, 2,3);
			
			methodOfJava.add(5.9, 4.3);
			
			System.out.println();
		
		}
}
