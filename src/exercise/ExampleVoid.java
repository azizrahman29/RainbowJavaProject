package exercise;

public class ExampleVoid {

	public static void rankPoint(double points) {
		
		if (points >= 90) {
			System.out.println("Congrat! You've earned the rank A ");
			
		
		} else if (points >= 80) {
			System.out.println("Congrat! You've earned the rank B ");
			
		}else if (points >= 70) {
			System.out.println("Congrat! You've earned the rank C ");
			
		}else  {
			
			System.out.println("Sorry You've to try it again to get rank");
		}
	}
	public static void main(String[] args) {
		
		rankPoint(78);
			
		
	}
}
