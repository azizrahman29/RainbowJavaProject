package exercise1;

import java.util.*;

public class VectorIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vector = new Vector<String>();
		System.out.println("Print Vector: " + vector);

		vector.add("Orange");
		vector.add("Apple");
		vector.add("Strawbery");
		vector.add("Grabe");
		vector.add("Qivi");
		System.out.println("Print Vector: " + vector);

		vector.add("Orange");
		System.out.println("Print Vector: " + vector);

		// Loop---> for Loop
		System.out.println("\nFor Loop");
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}

		// Enumeration----> Iteration, Loop ---> method .elements();
		System.out.println("\nEnumeration");
		Enumeration en = vector.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		// Iterator---->

		System.out.println("\nIterator");

		Iterator i = vector.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("\nFor Each");
		for (String v : vector) {
			System.out.println(v);
		}

	}

}
