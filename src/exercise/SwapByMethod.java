package exercise;

public class SwapByMethod {

	

	
	static void swap(int a , int b) {
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("A: "+a +"\tB: "+b);
		
	}
	
	public static void main(String[] args) {
		
		int a = 7;
		int b = 8;
		
		swap(a,b);
		
	}
}
