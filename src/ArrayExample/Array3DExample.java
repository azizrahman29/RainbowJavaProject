package ArrayExample;

public class Array3DExample {

	public static void main(String[] args) {
		// 3D array 
		
				int [] array1 = {1, 2, 3, }; 
				
				int [] [] array2 = {        
									{1, 2, 3, },
									{1, 2, 3, }, 
									{5, 4, 6},
									{5, 6, 9, 0}
						
				}; 
				
				int [][][] array3 = {{   
					 					{1, 2, 3, 4}, 
					 					{3, 4, 0 , 9},   
					 					{4, 5, 0, 0}, 
					 					{5, 6, 6, 0}
					 					
								}}; 
				
				for(int i =0; i < array3.length; i++) {
					for (int j = 0; j < array3[i].length; j++) {
						for (int k =0; k <array3[i][j].length; k++) {
							
							System.out.print(array3 [i][j][k] + " ");
						}
						// new line 
						System.out.println();
					}
					// new line
					System.out.println();
				}

	}

}
