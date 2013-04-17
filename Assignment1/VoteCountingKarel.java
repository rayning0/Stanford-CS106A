//Section problem 1. Counting hanging chads from a ballot.

import stanford.karel.*;

public class VoteCountingKarel extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				deleteAllBeepers();
			}
			move();
		}
	}
	
	private void deleteAllBeepers() {
		turnLeft();
		deleteEnd();
		deleteEnd();
		turnRight();
	}
	
	private void deleteEnd() {
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
	}
}