package classObject;

public class City {

	// instance of variable / fields
	String name; 
	long population; 
	int size; 
	double area;
	
	// define the method
	public void display(){
		System.out.println("City Name: " +name);
		System.out.println("Population: " +population);
		System.out.println("Size of the city: " + size);
		System.out.println("Area of the city: " + area);
	}
	
	// main method 
	public static void main(String[] args) {
		
		// instantiate/ creating an object
		City fallsChurch = new City();
		fallsChurch.name = "Falls Church";
		fallsChurch.population = 53497251; 
		fallsChurch.size = 12879; 
		
		// name of the method 
		fallsChurch.display();
		
		// another 
		System.out.println("\n");
		City wd = new City();
		wd.name = "Woodbridge";
		wd.population = 65798251; 
		wd.size = 102679; 
		wd.display();
		
		// combine few cities in one route 
		City stafford, alexandaria; 
		stafford = new City();
		alexandaria = new City();
		
		System.out.println("\n default values");
		// stafford 
		//stafford.name = "Stafford"; 
		stafford.population = 457982; 
		stafford.display();
	}

}
