package ArrayExample;

public class ArrayList {

	public static void main(String[] args) {
		// array list double

				double[] list = { 121.9, 2.9, 31.4, 3.5 }; // index: means position/location/address

				// length
				System.out.println("length/size: " + list.length);

				// print all the elements
				for (int i = 1; i <= 3; i++) { // 1 2 3
					System.out.println(list[i]);
				}

				// summing all the elements
				// 1.9 + 2.9 + 3.4 + 3.5 = ? total ? --> +=

				double total = 0;

				for (int i = 0; i < list.length; i++) {
					total += list[i];
				}
				// print the total
				System.out.println("Total: " + total);

				// Finding the largest element -- > double max

				double max = list[0];

				for (int i = 0; i < list.length; i++) {

					// decision making --> if statement
					if (list[i] > max)
						max = list[i];

				}
				System.out.println("Maximum element: " + max);
				
				// smallest
				System.out.println("");
				
				double min = list[0];

				for (int i = 0; i < list.length; i++) {

					// decision making --> if statement
					if (list[i] < min)
						min = list[i];

				}
				System.out.println("Minimum element: " + min);
	}

}
