package lord;

import java.util.Scanner;

public class Equal_task{ 

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if (x == y) {
		 System.out.println(x + "=" + y);
		}if (x != y) {
		 System.out.println(x + "!=" + y);
		}if (x <= y) {
		 System.out.println(x + "<=" + y);
		} if (x <= y) {
		 System.out.println(x + "<" + y);
		} if (x >= y) {
		System.out.println(x + ">=" + y);
		}if (x > y) {
		 System.out.println(x + ">" + y);

	} 
}
}
