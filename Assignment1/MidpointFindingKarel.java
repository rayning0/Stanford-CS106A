/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

/* HW 1, Problem 4
Works by laying down full row of beepers, then picking up 
end beeper and moving back to other end, picking up
end beeper again, and so on, until we've zigzagged to
the middle. 
*/

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {
		layBeepersToWall();
		while (beepersPresent()) {
			returnPickUpLastBeeper();
		}
		putBeeper();
	}

	// Put down full row of beepers to other wall
	private void layBeepersToWall() {
		while (frontIsClear()) {
			move();
			putBeeper();
		}
		turnAround();
	}
	
	// Pick up beeper at current end, 
	// then return to other side
	private void returnPickUpLastBeeper() {
		if (beepersPresent()) {
			pickBeeper();
		}
		if (frontIsClear()) {
			move();
			moveTillLastBeeper();
		}	
	}	

	// Move across row up till 1 spot past last beeper.
	// Then turn around and move back 1.
	private void moveTillLastBeeper() {
		while (beepersPresent()) {
			move();
		}
		turnAround();
		if (frontIsClear()) {
			move();
		}
	}
}
