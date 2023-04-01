package exercise;

public class Test_Student {

	public static void main(String[] args) {
		
		// Creating Object
		
		Student s1 = new Student();
		
		
		s1.student_id=101;
		s1.student_name="Ali";
		s1.student_marks=97;
		
		System.out.println("Student Id: " +s1.student_id);
		System.out.println("Student Name: "+s1.student_name);
		System.out.println("Student Marks: "+s1.student_marks);
		System.out.println("Student Age: " +s1.student_age);
		System.out.println();
		
		// creating another object for student class
		
		Student s2 = new Student();
		
		s2.student_id=102;
		s2.student_name="Sara";
		s2.student_marks=98.6;
		
		System.out.println("Student Id: "+s2.student_id);
		System.out.println("Student Name: "+s2.student_name);
		System.out.println("Student Marks: "+s2.student_marks);
		
		// Creating the 3rd object and initialization
		Student elena=new Student();
		
		elena.student_id=103;
		elena.student_name="Elena";
		elena.student_marks=95.7;
		elena.student_age=24;
		
		System.out.println("\nStudent Id: " +elena.student_id);
		System.out.println("Student Name: "+elena.student_name);
		System.out.println("Student Marks: "+elena.student_marks);
		System.out.println("Student Age: " +elena.student_age);
		
		
		
		
		
		
	}

}
