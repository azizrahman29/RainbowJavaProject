package exercise;

public class StringExample {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		
		String str2 = "hello";
		
		String str3 = new String ("Hello");
		String str4 = new String ("Hello");
		
		if (str1 == str2) {
			System.out.println("str1 & str2 is equal");
			
		}else {
			
			System.out.println("str1 & str2 is Not equal");
	}
		
		// Another Example
		
		String name = new String("\nAhmad");
		
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
	}

}
