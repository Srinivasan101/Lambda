package lambda_Predicate;

import java.util.function.Predicate;

public class Check_Three {

	public static void main(String[] args) {
		//And Or Negate
		
		int [] x = {5,10,15,20,25,30,35,40,45,50,55,60,65};
		Predicate <Integer> p = i -> (i%2 == 0);
		Predicate <Integer> s = i -> (i > 40);
		 for (int e : x) {
			 if (p.test(e) && s.test(e)) {
				 System.out.println(e);
			 }
			// if (p.test(e) || s.test(e)) {
				// System.out.println(e);
			// }
			// if(p.test(e));
			 //if ( s.negate().test(e));
		 }

	}

}
