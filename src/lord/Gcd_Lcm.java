package lord;

public class Gcd_Lcm {
	    public static void main(String[] args) {
	        int num1 = 24, num2 = 36;
	        int gcd = findGCD(num1, num2);
	        int lcm = findLCM(num1, num2, gcd);
	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
	        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
	    }

	    public static int findGCD(int num1, int num2) {
	        if (num2 == 0) {
	            return num1;
	        } else {
	            return findGCD(num2, num1 % num2);
	        }
	    }

	    public static int findLCM(int num1, int num2, int gcd) {
	        return (num1 * num2) / gcd;
	    }
	}


