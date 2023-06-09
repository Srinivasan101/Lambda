package lambda_Predicate;

import java.util.function.Predicate;

public class Demo_1 {

	public static void main(String[] args) {
		
		Predicate <Integer> p = s -> (s > 10);
		System.out.println(p.test(20));
	}

}
