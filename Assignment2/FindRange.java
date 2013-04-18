/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

// HW 2. Problem 5. Read in list of integers. Show the smallest/largest values in list.

import acm.program.*;

public class FindRange extends ConsoleProgram {
	private static final int SENTINEL = 0;
	public void run() {
		while(true) {	//infinite loop, for multiple tests
			int max = 0, min = 0, previous = 0;
			println("Enter list of integers. This finds the largest/smallest numbers. Type " + SENTINEL + " to quit.");
			
			while(true) {
				int i = readInt("? ");
				if (i == SENTINEL) break;	//done with entering list
				if (i > max) {
					max = i;
				}
				if (i < min) {
					min = i;
				}
				if (i < previous && min == 0) {	 //To catch if you enter 5, 4, quit. Otherwise, min would be 0.
					min = i;
				}
				if (i > previous && max == 0) {	 //To catch if you enter -5, -4, quit. Otherwise, max would be 0.
					max = i;
				}
				previous = i;	//previous value reset to latest value
			}
			
			if (min == 0) {
				if (max == 0) {
					println("You entered no values besides " + SENTINEL + ". Try again.");
				}
				else {
					min = max;	// you only entered 1 number before leaving
				}
			}
			
			if (max == 0 && min != 0) {
				max = min;   // you only entered 1 number before leaving
			}

			println("Smallest: " + min);
			println("Largest:  " + max);
		}
	}
}

