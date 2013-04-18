/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

// HW 2. Problem 2.

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	
	private static final double RADIUS1 = 72;
	private static final double RADIUS2 = 0.65 * RADIUS1;
	private static final double RADIUS3 = 0.3 * RADIUS1;
	
	public void run() {
		
		double cx = getWidth() / 2, cy = getHeight() / 2;
		Color color1 = Color.RED;
		Color color2 = Color.WHITE;
		Color color3 = Color.RED;
		
		makeCircle(cx, cy, RADIUS1, color1);
		makeCircle(cx, cy, RADIUS2, color2);
		makeCircle(cx, cy, RADIUS3, color3);	
	}
	
	private void makeCircle(double cx, double cy, double radius, Color color) {
		GOval circle = new GOval(cx - radius, cy - radius, 2 * radius, 2 * radius);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}
}
