package assignment;

public class Q01A5 {
	
	
	static void swapValues(int x , int y) {
		
		int temp = x;
				 x=y;
				 y=temp;
				 
				 System.out.println("x: " +x + "\t y:" +y);
				 
	}
	
	public static void main(String []args) {
		
		int x = 2;
		int y = 3;
		
		System.out.println("After swapping");
		swapValues (x,y);
	}

}
