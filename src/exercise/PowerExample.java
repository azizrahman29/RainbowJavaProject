package exercise;

public class PowerExample {

	public static void main(String[] args) {
		// 2*2*2*2*2=?
		
		
		
		int number =2;
		int p = 6;
		
		int result =1;
		
		for(int i =p ; i!= 0 ; i--) {
			
		result *=number;
		
		}
		System.out.println(number + " ^ " +p +" = "+ result);
		System.out.println();
		
		double result1 =Math.pow(number, p);
		System.out.println(result1);
		
	
	}

}
