package exercise1;

public class TestAnimalDog {

	public static void main(String[] args) {
	
		Animal a = new Animal("German shepherd");
		
		a.name = "Cat";
		a.age = 2;
		a.bread="German shepherd";
		
		a.eat();
		System.out.println("Name: "+ a.name);
		System.out.println("Age: "+ a.age);
		System.out.println("Bread: "+a.bread);
		
		Dog d = new Dog(null);
		d.name = "Ace";
		d.age =3;
		
		System.out.println("\nDog Name: "+ d.name);
		System.out.println("Dog Age: "+ d.age);
		
		d.eat();
	}

}
