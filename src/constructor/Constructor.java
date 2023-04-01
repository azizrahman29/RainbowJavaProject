package constructor;

public class Constructor {
	
	// data members/fields/variables
	// state --> variables
	int id; 
	String name; 
	String position; 
	String employer; 
	String location; 
	double salary; 
	
	// constructor
	Constructor(){
		// NoArgs Constructor --> there is no harm/conflict if you have/ don't have it
		System.out.println("This is a No Args Constructor");
	}
	
	Constructor(int employeID, String employeName, String employePosition, String employerName, String employeeLocation,
						double employeeSalary){
		id = employeID; 
		name = employeName;
		position = employePosition;
		employer = employerName;
		location = employeeLocation;
		salary = employeeSalary; 
	}
	
	// Creating methods responsibilities | behavior --> methods/ actions 
	
	public String resp1 () {
		return "1. Overseeing daily business operations" ; 
	}
	public String resp2 () {
		return "2. Developing and implementing business strategies" ; 
	}
	public String resp3 () {
		return "3. Improving the revenue and hiring new employees" ; 
	}
	public String resp4() {
		return "4. Evaluating performances and productivity, indeed analyzing the financial data" ; 
	}
	
	// main method
	public static void main(String[] args) {
		// call the constructor and initialize the values
		Constructor employee = new Constructor (101, "Ahmad", "Manager", "Wells Fargo", "Stafford, VA", 67000 );
		
		System.out.println("Employee Information");
		System.out.println("____________________");
		System.out.println("ID: " + employee.id );
		System.out.println("Name: " + employee.name );
		System.out.println("Position: " + employee.position );
		System.out.println("Employeer: " + employee.employer);
		System.out.println("Locaiton: " +employee.location);
		System.out.println("Salary: " + employee.salary);
		
		// calling methods
		System.out.println("\nEmployee Responsibilities");
		System.out.println("____________________________");
		System.out.println(employee.resp1());
		System.out.println(employee.resp2());
		System.out.println(employee.resp3());
		System.out.println(employee.resp4());
		

	}

}
