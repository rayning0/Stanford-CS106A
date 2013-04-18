/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

// HW 2. Problem 6. "Hailstone sequence."
// If n = 27, it takes 111 steps to reach 1.

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int counter = 0;
		boolean even = false;
		
		println("***Hailstone sequence***");
		println("Pick some positive integer and call it n.");
		println("If n is even, divide it by two.");
		println("If n is odd, multiply it by three and add one.");
		println("Continue this process until n is equal to one.");
		int n = readInt("Enter integer: ");
		
		while (n != 1) {
			even = (n % 2 == 0);
			if (even) {
				print(n);
				n /= 2;
				println(" is even, so n/2 = " + n);
			} else {
				print(n);
				n = 3 * n + 1;
				println(" is odd, so 3n + 1 = " + n);
			}
			counter++;
		}
		println("The process took " + counter + " steps to reach 1.");
	}
}

