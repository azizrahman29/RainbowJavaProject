package polymorphism;

public class MountainBicycle extends Bicycle{
	
	// its own data members --> variables
	public int height; 
	
	// method for above fields
	public void h (int height) {
		this.height = height; 
	}

	// Constructor --> Mountain Bicycle which is a subclass of Bicycle
	public MountainBicycle (int gear, int speed, int i) { // i --> height
		
		// super: call the arguments from base class inside of the child class
		super (gear, speed); 
		height = i; 
		
	}
	
	// Override the method 
	public String toString () {
		return (super.toString() + "\n Height: " +height);
	}
}
