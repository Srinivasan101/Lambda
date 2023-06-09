package lord;

public class Array_new {

	public static void main(String[] args) {
		
		        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		        int[][] secondMatrix = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		        int[][] sumMatrix = new int[3][3];

		        // Iterate through each element of the matrices and add the corresponding elements
		        for (int i = 0; i < firstMatrix.length; i++) {
		            for (int j = 0; j < firstMatrix[0].length; j++) {
		                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
		            }
		        }

		        // Display the sum matrix
		        System.out.println("Sum of the matrices:");
		        for (int i = 0; i < sumMatrix.length; i++) {
		            for (int j = 0; j < sumMatrix[0].length; j++) {
		                System.out.print(sumMatrix[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}


	


