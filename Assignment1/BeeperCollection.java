import stanford.karel.*;

//Collects all beepers from whole board, 
//drops them all in last column, then returns home.

public class BeeperCollection extends SuperKarel {
	public void run() {
		getAllBeepers();
		dropAllBeepers();
		returnHome();
	}
	
	private void getAllBeepers() {
		while (frontIsClear()) {
			collectOneColumn();				
			move();
		}
		collectOneColumn();
	}
	
	private void collectOneColumn() {
		if (beepersPresent()) {
			turnLeft();
			getLineOfBeepers();
			turnAround();
			movetoWall();
			turnLeft();
		}
	}
	
	private void getLineOfBeepers() {
		while (beepersPresent()) {
			pickBeeper();
			if (frontIsClear()) {
				move();
			}
		}
	}
	
	private void dropAllBeepers() {
		while (beepersInBag()) {
			putBeeper();
		}
	}
	
	private void returnHome() {
		turnAround();
		movetoWall();
		turnAround();
	}
	
	private void movetoWall() {
		while (frontIsClear()) {
			move();
		}
	}
}