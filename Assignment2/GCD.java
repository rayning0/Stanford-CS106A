/*
 * File: GCD.java
 * Finding greatest common divisor of 2 numbers, using Euclid's algorithm.
 */

import acm.program.*;

public class GCD extends ConsoleProgram {
	public void run() {
		while(true) {
			println("Finding GCD of 2 integers. Enter two 0's to exit.");
			int x = readInt("Enter 1st #: ");
			int y = readInt("Enter 2nd #: ");
			if (x == 0 && y == 0) break;
			println("GCD = " + gcd(x, y));
		}
		println();
	}
	
	private static int gcd(int x, int y) {
		int r = x % y;
		if (r == 0) {
			return y;
		}
		else {
			x = y;
			y = r;
			return gcd(x, y); //recursive solution
		}
	}
	
	/* non-recursive solution
	int gcd(int x, int y) {
        int r = x % y;
        while (r != 0) {
            x = y;
			y = r;
			r = x % y; 
		}
		return y; 
	}   */

}

