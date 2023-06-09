package lambda.Function;

import java.util.function.Function;

public class Demo2 {

	public static void main(String[] args) {
		Function <String, Integer> s = w -> w.length();
		System.out.println(s.apply("Buddha"));
		System.out.println(s.apply("Ayyapan"));

	}

}
