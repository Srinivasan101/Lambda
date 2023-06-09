package lambda_Predicate;

import java.util.function.Predicate;

public class Demo_2 {

	public static void main(String[] args) {
		
		Predicate <String> pr = i -> (i.length() > 4);
		System.out.println(pr.test("welcome"));

	}

}
