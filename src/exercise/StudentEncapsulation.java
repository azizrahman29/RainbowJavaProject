package exercise;

public class StudentEncapsulation {

	private String student_name;
	private int student_id;
	private double student_fee;
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public double getStudent_fee() {
		return student_fee;
	}
	public void setStudent_fee(double student_fee) {
		this.student_fee = student_fee;
	}
	
	public static void main(String[] args) {
		StudentEncapsulation s = new StudentEncapsulation();
				
		s.setStudent_name("Ahmad");
		s.setStudent_id(10001);
		s.setStudent_fee(200);
		
		
		System.out.println("Student Name: "+ s.getStudent_name());
		System.out.println("Student ID: "+ s.getStudent_id());
		System.out.println("Student Fee: "+ s.getStudent_fee());
	}
	
}
