/*
 * File: SimpleRandom.java
 * -----------------------
 * This program provides a simple example of using
 * random numbers
 */

import acm.program.*;
import acm.util.*;

public class SimpleRandom extends ConsoleProgram {

	private static final int NUM_SIDES = 6;
	
	public void run() {
		rgen.setSeed(3);
		int dieRoll = rgen.nextInt(1, NUM_SIDES);
		println("You rolled " + dieRoll);
	}
		
	/* Private instance variables */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
