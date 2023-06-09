package lord;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		      int n, firstTerm = 0, secondTerm = 1;
		      Scanner scan = new Scanner(System.in);
		      System.out.print("Enter the number of terms: ");
		      n = scan.nextInt();
		      System.out.print("Fibonacci Series of "+n+" terms: ");

		      for (int i = 1; i <= n; i++) {
		         System.out.print(firstTerm + " ");
		         int nextTerm = firstTerm + secondTerm;
		         firstTerm = secondTerm;
		         secondTerm = nextTerm;
		      }
		   }
		}
