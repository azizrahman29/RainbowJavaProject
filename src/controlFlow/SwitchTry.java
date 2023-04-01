package controlFlow;

public class SwitchTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int apartmentsRoom;
		apartmentsRoom =5;
		
		switch (apartmentsRoom) {
		case 1:
			System.out.println("the family member is 2");
			break;
		case 2: 
			System.out.println("the family member is 3");
		    break;
		case 3:
			System.out.println("the family member is 4");
			break;
		case 4:
			System.out.println("the family member is 5");
			break;
		default :
			System.out.println(" out of standard");
			break;
		}
		
	}

}
