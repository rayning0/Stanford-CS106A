import stanford.karel.*;

//Karel finds exit of any maze, by traveling only along right side

public class Maze extends SuperKarel {
	public void run() {
		while (noBeepersPresent()) {
			turnRight();
			while (frontIsBlocked()) {
				turnLeft();
			}
			move();
		}		
	}
}