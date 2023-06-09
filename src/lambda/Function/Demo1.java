package lambda.Function;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		Function<Integer,Integer> w = s -> s *s;
		System.out.println(w.apply(5));
		System.out.println(w.apply(6));

	}

}
