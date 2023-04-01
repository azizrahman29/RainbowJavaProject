package classObject;

public class Dog {
	
	// Object: is an instance/ sample of the class --> state plus behavior (entity of the object)
	// Class: is a blueprint/ prototype / shape / design/ sketch 
	
	// Identity: to chose a name for my class
	
	// Instance of variables / fields / data members (state of the dog)
	String breed; 
	int age;
	String color; 
	
	// Method --> behavior/action 
	public static void eat () {
		System.out.println("Dog is eating");
	}
	
	// method with void
	public static void sleep() {
		System.out.println("Dog is sleeping");
	}
	
	// Method with void
	public static void playing() {
		System.out.println("Dog is playing");
	}
	
	// Method --> return type 
	public String getInfo() {
		return ("Breed is: " + breed + " Age is: " + age + " Color is: " + color);
	}
	
	// main method 
	public static void main(String[] args) {
		// create an object of the class
		// to create an object: Name of the class with new reserved 
		Dog maltese = new Dog (); 
		maltese.breed = "Maltese"; 
		maltese.age = 2; 
		maltese.color = "White";
		System.out.println(maltese.getInfo()); // object + name of the method
		// voidMethod
		eat ();
		sleep();
		
		// another dog
		Dog gS = new Dog();
		gS.breed = "German Shepherd"; 
		gS.age = 3; 
		gS.color = "black & white";
		System.out.println(gS.getInfo());
		
		// void method
		playing();
	}

}
