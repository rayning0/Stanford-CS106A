/* 
 * File: ColorChangingSquare.java 
 * ------------------------------
 * This program puts up a square in the center of the window
 * and randomly changes its color every second.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class ColorChangingSquare extends GraphicsProgram {

	/* Size of the square in pixels */
	private static final int SQUARE_SIZE = 100; 
	
	/* Pause time in milliseconds */ 
	private static final int PAUSE_TIME = 1000; 
	
	public void run() { 
		GRect square = new GRect(SQUARE_SIZE, SQUARE_SIZE); 
		square.setFilled(true); 
		add(square, (getWidth() - SQUARE_SIZE) / 2, 
				    (getHeight() - SQUARE_SIZE) / 2);
		
		/* Note: we meant to have this infinite loop */
		while (true) { 
			square.setColor(rgen.nextColor()); 
			pause(PAUSE_TIME); 
		} 
	} 
	
	/* Private instance variables */ 
	private RandomGenerator rgen = 
				RandomGenerator.getInstance(); 
}