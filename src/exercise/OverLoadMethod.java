package exercise;

public class OverLoadMethod {

	public static void main(String[] args) {
		
		// Overload Method: Method that share  the same name but have different parameters.
		
		// Method name + parameters = Method signature .
		
	
		double x = add (1.0,2.5,3.0,7.0);
		
		System.out.println(x);

	}
	
	static void add(int a, int b) {
		
		System.out.println("this is overload Method #1 ");
	}
	
	static int add(int a , int b ,int c) {
		System.out.println("this is overload Method #2 ");
		return a+b+c ;
		
	}
	
	static double add(double a , double b , double c ,double d) {
		System.out.println("this is overload Method #3");
		return a + b + c + d;
	}

}
