package exercise1;

import java.util.*;

public class StackConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Stack: LIFO---> last In First Out  : linear data structure
 
 	Plate3
     Plate2
     Plate1
 */
		
		Stack <String> stack= new Stack();
		System.out.println("Print Stack: "+stack);
		System.out.println("Stack Size: "+stack.size());
		
		
		// Push--> insert an elements
		stack.push("Plate1");
		stack.push("Plate2");
		stack.push("Plate3");
		stack.push("Plate4");
		System.out.println("Print Stack: "+stack);
		System.out.println("Stack Size: "+stack.size());
		
		// Pop: remove the last inserted element from the stack
		
		String plateAtTop = stack.pop();
		System.out.println("     Last inserted element: "+plateAtTop);
		System.out.println("Print Stack: "+stack);
		System.out.println("\nLast inserted element: "+stack.pop());
		System.out.println("Print Stack: "+stack);	
	
	//System.out.println("\nLast inserted element: "+stack.pop());
	System.out.println("Print Stack: "+stack);	

	//System.out.println("\nLast inserted element: "+stack.pop());
	System.out.println("Print Stack: "+stack);	
	System.out.println("Stack Size: "+stack.size());
	
	// peek: returns top element from stack without removing it
	
	String topElement =stack.peek();
	System.out.println("\nPeek without removing: "+topElement);
	System.out.println("Print Stack: "+stack);
	
	// search: object element from top of the stack --->
	
	int index = stack.search("Plate2");
	System.out.println("Search plate3: "+index);
	
	
	// empty: validate the stack has object element --> true | if stack is empty ---> false
	

	
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	boolean isEmpty = stack.empty();
	System.out.println("Stack is empty: "+isEmpty);
	
	
	
	
	
	
	
	
	
	
	
	
}
}


