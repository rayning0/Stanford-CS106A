/* Chapter 6, Problem 3: "The Art and Science of Java"
"you can use random numbers to generate a rough approximation of the constant ¹ by writing a simple 
program that simulates a dart board." The # of darts falling into circle / # of darts falling into square = PI/4.
Write a program that simulates throwing 10,000 darts and then uses the Monte Carlo simulation technique described in this 
exercise to generate and display an approximate value of ¹. 
*/

import acm.program.*;
import acm.util.*;	//RandomGenerator class in here

public class PiDartsMonteCarlo extends ConsoleProgram {
	
	public void run() {
		int darts = 0;
		double pi = 0.0;
		while(true) {
			int circledarts = 0; // # of darts that fall into circle
			darts = readInt("Calculate PI. How many darts do you want to shoot at dartboard? ");
			for (int i = 0; i < darts; i++) {
				double x = rgen.nextDouble(-1.0, 1.0);	//randomly generate x, y coordinates between -1 and +1
				double y = rgen.nextDouble(-1.0, 1.0);		
				if ((x * x + y * y) < 1) {	//if sqrt(x^2 + y^2) < 1, 
					circledarts++;	// darts fall inside circle of radius 1
				} 
			}
			pi = (double) 4 * circledarts / darts;
			println("After shooting " + darts + " darts at a board, the Monte Carlo simulation gives PI =");
			println(pi);
			println("Darts in circle: " + circledarts);
		}
	}
	
	// private instance variables
	private RandomGenerator rgen = RandomGenerator.getInstance();
}