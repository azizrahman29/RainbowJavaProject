package exercise;

public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationExample obj = new EncapsulationExample();
		
		obj.setSSN(12345);
		obj.setName("Ali");
		obj.setAge(25);
		obj.setPN(845543067);
		
		
		
		System.out.println("SSN: "+ obj.getSNN());
		System.out.println("Name: "+ obj.getName());
		System.out.println("Age; "+obj.getAge());
		System.out.println("Phone Number: "+obj.getpN());
	}
	

}
