package lord;

import java.util.Scanner;

public class Mani_task {

	public static void main(String[] args) {
		int add =0;  int sum =0;
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt();
		
		while(x != 0) {
			
			add += x %10;
			x /=10;
			 	
		}
		System.out.println(add);
	}

}
