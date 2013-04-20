/*
 * File: FactorialExample.java
 * ---------------------------
 * This program writes out the factorials for the
 * first few integers.
 */

import acm.program.*;

public class FactorialExample extends ConsoleProgram {
	
	private static final int MAX_NUM = 10;
	
	public void run() {
		for(int i = 0; i < MAX_NUM; i++) {
			println(i + "! = " + factorial(i));
		}
	}

	/* 
	 * factorial m(n): Computes n!
	 * 
	 * pre-condition: The input parameter n >= 0 and n <= 31. 
	 *    Trying to compute 32! is greater than the largest 
	 *    possible int value. Note that in
	 *    math, the factorial of a negative number is not defined
	 * postcondition: The method returns the value of n!
	 */
	private int factorial(int n) {
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}
}
