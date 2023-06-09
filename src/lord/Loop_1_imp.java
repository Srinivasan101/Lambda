package lord;

import java.util.Scanner;

	public class Loop_1_imp {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int positiveCount = 0;
	        int negativeCount = 0;
	        int zeroCount = 0;
	        
	        while (true) {
	            System.out.print("Enter a number (enter 0 to stop): ");
	            int number = input.nextInt();
	            
	            if (number == 0) {
	                break;
	            } else if (number > 0) {
	                positiveCount++;
	            } else {
	                negativeCount++;
	            }
	        }
	        
	        System.out.println("Number of positive values: " + positiveCount);
	        System.out.println("Number of negative values: " + negativeCount);
	        System.out.println("Number of zero values: " + zeroCount);
	    }
	}



