/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

// HW 2. Problem 1.

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
//Sets window size. Overrides ACM default size of 800 width, 500 height
	public static final int APPLICATION_WIDTH = 500, APPLICATION_HEIGHT = 300; 
	
	public void run() {
		//starting x and y coordinates for brick 1, at left base of pyramid
		double start_x = (double) getWidth() / 2 - BRICKS_IN_BASE * BRICK_WIDTH / 2;
		double start_y = (double) getHeight() - BRICK_HEIGHT;
		
		int bricks = BRICKS_IN_BASE;
		while (bricks > 0) {
			drawBrickRow(bricks, start_x, start_y);
			bricks -= 1;
			start_y -= BRICK_HEIGHT;
			start_x += BRICK_WIDTH / 2;
		}
	}
	
	private void drawBrickRow(int bricks, double x, double y) {
		for (int i = 0; i < bricks; i++) {
			add(new GRect(x + i * BRICK_WIDTH, y, BRICK_WIDTH, BRICK_HEIGHT));
		}
	}
}

