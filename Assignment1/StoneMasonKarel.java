/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

// HW 1, Problem 2
// Repairs all vertical columns of beepers

public class StoneMasonKarel extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			fixColumn();
			moveNextColumn();
		}
		fixColumn();	// prevents fencepost error
		goHome();
	}
	
	private void fixColumn() {
		turnLeft();
		moveToWall();
		turnAround();
		putBeeperIf();
		while (frontIsClear()) {
			move();
			putBeeperIf();
		}
		turnLeft();
	}
	
	private void putBeeperIf() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}
	
	//does for loop in case # of columns is not 4n+1
	private void moveNextColumn() {
		for (int i = 0; i < 4; i++) {
			if (frontIsClear()) {
				move();
			}
		}
	}
	
	private void moveToWall() {
		while (frontIsClear()) {
			move();
		}
	}
	
	private void goHome() {
		turnAround();
		moveToWall();
		turnAround();
	}
}
