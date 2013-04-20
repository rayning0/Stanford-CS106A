/*
 * File: RollDice.java
 * --------------------
 * This program simulates rolling a die some number
 * of times.
 */

import acm.program.*;
import acm.util.*;

public class RollDice extends ConsoleProgram {
	
	/* Number of sides on each die */
	private static final int NUM_SIDES = 6;
		
	public void run() {
		int numRolls = readInt("Number of rolls: ");
		for (int i = 0; i < numRolls; i++) {
			int roll = rgen.nextInt(1, NUM_SIDES);
			println("You rolled: " + roll);
		}
	}

	/* Private instance variables */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
