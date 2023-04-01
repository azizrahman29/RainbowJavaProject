package basic;

public class Revesion {

	public static void main(String[] args) {
		// Control Flow Revision, if.. else if.. else 
		
		// marks 1 - 100 (out of range is invalid score)
		
		int marks = 104; 
		
		if (marks < 50) { // 49
			System.out.println("You've failed");
		} else if (marks >= 50 && marks <60) { // 
			System.out.println("You've got Grade D");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("You've got Grade C");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("You've got Grade B");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("You've got Grade A");
		} else if (marks >= 90 && marks < 100) {
			System.out.println("You've got Grade A+");
		} else {
			System.out.println("Invalid Score!");
		}
	}

}
