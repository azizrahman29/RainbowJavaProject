package controlFlow;

public class PatternsByForLoop {

	public static void main(String[] args) {
		// Patterns
		System.out.println(" Hey ! What is this shape?");
		
		for (int i = 1 ; i<=5 ; i++) {
	
		
		 for (int j = 0; j<i ; j++) {
			 System.out.print(" * ");
		 }
System.out.println();
	}
  
		for (int i = 4 ; i>0 ; i--) {
			
		

		 for (int j = 0; j<i ; j++) {
			 System.out.print(" * ");
		 }
System.out.println();
	}
		System.out.println("\n\nAnother Example");
		int n = 5;
		for(int i= 1; i<= n ; i++) {
			System.out.print(" \n* ");
			
			
		
		
		for ( int j= 1 ; j<=n ;j ++ ) {
			System.out.print(" * ");
		}
			
			System.out.println();
			
			
		}	
		System.out.println("\n\nAnother Example !");
		
		int h =5;
		for (int i =1 ; i<=h; i++) {
			for (int j = i ; j <=h ; j++) {
				System.out.print("   ");
			}
			for (int j = 1 ; j <=i ; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		
			}
		System.out.println(" \n\nDiamond pattern Example!");
	
		
	}
}
