package polymorphism;

public class Bicycle {

	// base class
	public int gear; 
	public int speed; 
	
	// constructor --> Name of the class should written
	public Bicycle (int gear, int speed) {
		// this --> point on data members
		this.gear = gear; 
		this.speed = speed; 
	}
	
	// methods
	// applying the brake
	public void brake (int decrement) {
		speed -= decrement; // 
		//speed = speed - decrement; 
	}
	
	// speeding up
	public void speed(int increment) {
		speed += increment; 
	}
	
	// base class we call the method --> copy to the child --> toString () --> @Overriden Method
	public String toString () {
		return (" Number of gears are: " + gear + "\n Speed of the Bicycle: " + speed);
	}
}
