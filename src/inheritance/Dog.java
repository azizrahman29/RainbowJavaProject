package inheritance;

public class Dog extends Animal {

	
	// add that parent's method here --> inside the child class
	
	
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
}
