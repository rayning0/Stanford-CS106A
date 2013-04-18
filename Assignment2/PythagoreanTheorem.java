/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */


// HW 2. Problem 4. 
import acm.program.*;
import java.lang.Math;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter 2 integers a and b. Will find c by Pythagorean theorem.");
		int a = readInt("a: ");
		int b = readInt("b: ");
		println("c = " + (double) Math.sqrt(a * a + b * b));
	}
}
