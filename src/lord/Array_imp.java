package lord;

import java.util.Scanner;

public class Array_imp {

	public static void main(String[] args) {
		Scanner Sri = new Scanner (System.in);
		System.out.println("GIVE THE LENGTH");
		int Num = Sri.nextInt();
		float sum =0;	
		int []Number = new int [Num];
		
		
		for(int i = 0; i < Num; i++) {
			Number[i] = Sri.nextInt();
			
		}
		for(int i= 0; i < Num; i++) {
			sum = sum +Number[i];
		}
		float Avg = sum/Num;
		System.out.println("AVG IS : "+ Avg);
	}
	
}
