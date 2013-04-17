/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

// HW 1, Problem 3

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		fillRow();
		while (leftIsClear()) {
			// if last square of row is empty (even width),
			// 1st square of row above must be filled
			if (noBeepersPresent()) { 
				upAndTurnLeft();
				fillRow();
			} else {
				
			// if last square of row is full (odd width),
			// 1st square of row above must be empty
				upAndTurnLeft();
				fillRow2();
			}
			
			if (rightIsClear()) {
				if (noBeepersPresent()) {
					upAndTurnRight();
					fillRow();
				} else {
					upAndTurnRight();
					fillRow2();
				}
			} else
				turnAround();
		}
	}
	
	// put beeper in 1st spot, then alternate
	private void fillRow() {	
		putBeeper();
		while (frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
			}
		}
	}
	
	// put beeper in 2nd spot, then alternate
	private void fillRow2() {
		while (frontIsClear()) {
			move();
			putBeeper();
			if (frontIsClear()) {
				move();
			}
		}
	}

	private void upAndTurnLeft() {
		turnLeft();
		move();
		turnLeft();

	}
	
	private void upAndTurnRight() {
		turnRight();
		move();
		turnRight();
	}
}
