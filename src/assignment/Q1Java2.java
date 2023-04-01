package assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1Java2 {

	public static void main(String[] args) throws IOException {
		  // opening the text file
        File file =new File("text.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        
        // asking user to input calculation
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");


        num1 = (int) scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = (int) scanner.nextDouble();
       

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
         
        scanner.close();
        double output;
        
        
        
        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;
            case '%':
            	output = num1%num2;
            	break;

            // If user enters any other operator or char apart from
             // +, -, * and /, then display an error message to user
             
            default:
                
                System.out.printf("You have entered wrong operator");
                return;


        }

        System.out.println(num1+" "+operator+" "+num2+" = "+output);
        // writing to file
        writer.write(num1+" "+operator+" "+num2+" = "+output); 
        writer.flush();
        writer.close();
        System.out.println("Data is entered into file");
	}

}
