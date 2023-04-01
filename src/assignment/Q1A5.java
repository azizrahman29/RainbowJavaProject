package assignment;

public class Q1A5 {

	public static void main(String[] args) {
		

		int first = 20;
		
		int second = 30;
		
		System.out.println("      ** Swapping the Values **");
		System.out.println("\nBefore Swap!");
		System.out.println("\nFirst Value : " +first);
		System.out.println("Second Value : "+second);
		
		
		
		int temp = first;
		first = second;
		second= temp;
		System.out.println("\nAfter Swap!");
		
		System.out.println("\nFirst Value : " +first);
		System.out.println("Second Value : "+second);
		
	}

}
