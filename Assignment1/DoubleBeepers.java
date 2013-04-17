/*
* File: DoubleBeepers.java
* ------------------------
* Karel doubles the number of beepers on the corner directly
* in front of him in the world. He then returns to his
* original position/orientation.
*/
import stanford.karel.*;

public class DoubleBeepers extends SuperKarel {
	public void run() {
		move();
		doubleBeepersInPile();
		moveBackward();

	}
	/*
	* For every beeper on current corner, Karel places
	* two beepers on the corner immediately ahead of him.
	*/
	
	/* Recursive way of solving whole problem 
	private void doubleBeepersInPile() {
		if (beepersPresent()) {
			pickBeeper();
			doubleBeepersInPile();
			putBeeper();
			putBeeper();
		}
	}
	*/
	
	
	private void doubleBeepersInPile() {
		while (beepersPresent()) {
			pickBeeper();
			putTwoBeepersNextDoor();
		}
		movePileNextDoorBack();
	}
	
	/*
	* Place two beepers on corner one avenue ahead of Karel
	* and move back to starting position/orientation
	*/
	private void putTwoBeepersNextDoor() {
		move();
		putBeeper();
		putBeeper();
		moveBackward();
	}
	/*
	* Move all the beepers on the corner in front of Karel
	* to the corner Karel is currently on.
	*/
	private void movePileNextDoorBack() {
		move();
		while (beepersPresent()) {
			moveOneBeeperBack();
		}
		moveBackward();
	}
	
	/*
	* Move one beeper from the current corner back one avenue
	* and return to the original position/orientation.
	*/
	private void moveOneBeeperBack() {
		pickBeeper();
		moveBackward();
		putBeeper();
		move();
	}
	/*
	* Move Karel back one avenue, but have the same
	* final orientation.
	*/
	private void moveBackward() {
		turnAround();
		move();
		turnAround();
	}
}