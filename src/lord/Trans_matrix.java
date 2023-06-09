package lord;

public class Trans_matrix {

	public static void main(String[] args) {
		
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		// find the number of rows and columns in the matrix
		int rows = matrix.length;
		int cols = matrix[0].length;

		// create a new matrix to hold the transpose
		int[][] transpose = new int[cols][rows];

		// compute the transpose
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < cols; j++) {
		        transpose[j][i] = matrix[i][j];
		    }
		}

		// display the transpose
		System.out.println("The transpose of the matrix is:");
		for (int i = 0; i < cols; i++) {
		    for (int j = 0; j < rows; j++) {
		        System.out.print(transpose[i][j] + " ");
		    }
		    System.out.println();
		}
		
		
		
		

	}

}
