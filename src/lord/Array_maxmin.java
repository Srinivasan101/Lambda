package lord;

public class Array_maxmin {

	public static void main(String[] args) {
		int[] array = { 5, 8, 3, 6, 1, 9 };
		int max = array[0];
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
		   if (array[i] > max) {
		      max = array[i];
		   }
		   if (array[i] < min) {
		      min = array[i];
		   }
		}
		System.out.println("Maximum value in the array is: " + max);
		System.out.println("Minimum value in the array is: " + min);


	}

}
