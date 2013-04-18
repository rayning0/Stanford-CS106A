/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

// HW 2. Problem 3. Drawing of class hierarchy.

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	// Width and height of class boxes. Horizontal gap between them.
	private static final int WIDTH = 150, HEIGHT = 50, GAP = 15;
	
	// Text inside each of the boxes
	private static final String STR1 = "GraphicsProgram", STR2 = "ConsoleProgram";
	private static final String STR3 = "DialogProgram", STR4 = "Program";
	
	
	public void run() {
		double cx = getWidth() / 2, cy = getHeight() / 3;
		
		drawBox(STR1, cx - 1.5 * WIDTH - GAP, 2 * cy - HEIGHT / 2, WIDTH, HEIGHT);
		drawBox(STR2, cx - WIDTH / 2, 2 * cy - HEIGHT / 2, WIDTH, HEIGHT);
		drawBox(STR3, cx + WIDTH / 2 + GAP, 2 * cy - HEIGHT / 2, WIDTH, HEIGHT);
		drawBox(STR4, cx - WIDTH / 2, cy - HEIGHT / 2, WIDTH, HEIGHT);

		drawLine(cx, cy + HEIGHT / 2, cx - WIDTH - GAP, 2 * cy - HEIGHT / 2);
		drawLine(cx, cy + HEIGHT / 2, cx, 2 * cy - HEIGHT / 2); 
		drawLine(cx, cy + HEIGHT / 2, cx + WIDTH + GAP, 2 * cy - HEIGHT / 2);
		
	}
	
	private void drawBox(String text, double x, double y, double width, double height) {
		add(new GRect(x, y, width, height));
		
		GLabel label = new GLabel(text, 0, 100); // create in arbitrary location
		label.setLocation(x + (width - label.getWidth())/2, y + (height + label.getAscent())/2);
		add(label);
	}
		
	private void drawLine(double x1, double y1, double x2, double y2) {
		add(new GLine(x1, y1, x2, y2));
	}
}

