package javaMethod;

public class Return {

	int addition (int x, int y) {
		
		int result = x + y; 
		return result; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Return r = new Return (); 
		System.out.println(r.addition(9, 105));

	}

}
