package lord;

import java.util.Scanner;


public class Rupees_note {

	public static void main(String[] args) {
		
				Scanner input = new Scanner(System.in);

		        int amount;
		        int noteCount;
		        int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		        System.out.print("Enter amount: ");
		        amount = input.nextInt();

		        for (int note : notes) {
		            noteCount = amount / note;

		            if (noteCount > 0) {
		                System.out.println(note + " notes: " + noteCount);
		            }

		            amount %= note;
		        }
		    }
		}


	


