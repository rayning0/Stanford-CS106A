/**
 * 
 * This program graphically simulates a bouncing ball. 
 *
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.applet.*;

public class BouncingBall extends GraphicsProgram {
	 /** Size (diameter) of the ball */ 
	 private static final int DIAM_BALL = 30; 
	 
	 /** Amount Y velocity is increased each cycle as a result of gravity */ 
	 private static final double GRAVITY = 3; 
	 
	 /** Animation delay or pause time between ball moves */ 
	 private static final int DELAY = 50; 
	 
	 /** Initial X and Y location of ball */ 
	 private static double X_START = DIAM_BALL / 2; 
	 private static final double Y_START = 100; 
	 
	 /** X Velocity */ 
	 private static final double X_VEL = 5; 
	 
	 /** Amount Y Velocity is reduced when it bounces */ 
	 private static final double BOUNCE_REDUCE = 0.9; 
	 
	 /** Starting X and Y Velocties */ 
	 private double xVel = X_VEL; 
	 private double yVel = 0.0; 
	 
	 /* private instance variable */ 
	 private GOval ball; 
	 private AudioClip bounceClip = MediaTools.loadAudioClip("Basketball.wav"); 
	 
	 public void run() {
		 while(true) {
			 // move ball to right
			 // end when ball moves off right side of screen
			 setup();
			 while (ball.getX() < getWidth()) {
				 moveBall();
				 checkForCollision();
				 pause(DELAY);
			 }
			 
			 //move ball to left
			 xVel = -X_VEL;
			 X_START = getWidth() - DIAM_BALL;
			 setup();
			 while (ball.getX() > -DIAM_BALL - 5) {
				 moveBall();
				 checkForCollision();
				 pause(DELAY);
			 }		 
			 
			 X_START = DIAM_BALL / 2;
			 xVel = X_VEL;
			 yVel = 0.0;
		 }
	 }
	 
	 // Create and place ball
	 private void setup() {
		 ball = new GOval(X_START, Y_START, DIAM_BALL, DIAM_BALL);
		 ball.setFilled(true);
		 add(ball);
	 }
	 
	 // Update/move ball down and sideways. yVel increases each cycle, due to gravity.
	 private void moveBall() {
		 yVel += GRAVITY;
		 ball.move(xVel, yVel);
	 }
	 
	 private void checkForCollision() {
		 //check if ball has hit floor. If so, bounce it upwards.
		 if (ball.getY() > getHeight() - DIAM_BALL) {
			 bounceClip.play();
			 yVel = -yVel * BOUNCE_REDUCE; //bounces back almost to BOUNCE_REDUCE * starting height
			 
			 //moves ball back above the floor the same distance it would have dropped below the floor in same time
			 double diff = ball.getY() - (getHeight() - DIAM_BALL);
			 ball.move(0, -2 * diff);
		 }
	 }
}
