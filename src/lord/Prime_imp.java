package lord;

public class Prime_imp {
	public static void displayPrimes() {
	    System.out.println("Prime numbers between 1 and 20:");
	    
	    // Loop through all numbers from 1 to 20
	    for (int i = 2; i <= 20; i++) {
	        boolean isPrime = true;
	        
	        // Check if i is prime by testing if it's divisible by any number from 2 to i-1
	        for (int j = 2; j < i; j++) {
	            if (i % j == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        
	        // If i is prime, print it
	        if (isPrime) {
	            System.out.print(i + " ");
	        }
	    }
	    
	    System.out.println();
	}

}
