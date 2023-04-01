package controlFlow;

public class QuizOfJava2 {

	public static void main(String[] args) {
		/*
		 Question2: Create a program to check whether an alphabet character is vowel or consonant using switch statement

                    Hint: Create a variable with char data type, use switch statement with the cases 
                    if they are vowel, else break it and print the default statement.
		 */
		 
		 

		
		char ch = 'e';
		
		switch (ch){
		
		case 'a' :
			System.out.println(ch + " is a vowel letter");
		   break;
		case 'e' :
			System.out.println(ch + " is a consnant letter");
			break;
		case 'i' :
			System.out.println(ch + " is a vowel letter");
			break;
		case 'o' :
			System.out.println(ch + " is a consnant letter");
			break;
		case 'u' :
			System.out.println(ch + " is a vowel letter");
			break;
		default :
			System.err.println( " It's not a vowel letter");
			break;
		}
	}

}
