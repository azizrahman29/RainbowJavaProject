package constructor;

public class Elena {

	

		public static void main(String[] args) {
			// Calling the class Constructor Employee and initializing with new values for another employee

			ConstructorEmployee employee = new ConstructorEmployee(109, "Elena", "Manager", "Wells Fargo", "Falls Church, VA",
					67000);

			System.out.println("Employee Information");
			System.out.println("____________________");
			System.out.println("ID: " + employee.id);
			System.out.println("Name: " + employee.name);
			System.out.println("Position: " + employee.position);
			System.out.println("Employeer: " + employee.employer);
			System.out.println("Locaiton: " + employee.location);
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
