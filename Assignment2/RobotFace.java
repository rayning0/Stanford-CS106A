/* File: RobotFace.java
 Section 2. Problem 2. Draw robot face.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import acm.util.*;	//get RandomGenerator

public class RobotFace extends GraphicsProgram {	
	
	//Sets window size. Overrides ACM default size of 800 width, 500 height
	public static final int APPLICATION_WIDTH = 600, APPLICATION_HEIGHT = 480; 
	
	private static final int HEAD_WIDTH = 250, HEAD_HEIGHT = 350;
	private static final int EYE_RADIUS = 27;
	private static final int MOUTH_WIDTH = 140, MOUTH_HEIGHT = 55;
	private RandomGenerator rgen = new RandomGenerator();	//create generator for random numbers
	
	public void run() {
		double scr_w = getWidth();	//window width
		double scr_h = getHeight();	//window height
		
		GRect head = new GRect((scr_w - HEAD_WIDTH) / 2, (scr_h - HEAD_HEIGHT) / 2, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);	//interior
		head.setColor(Color.BLACK);	//border
		
		GOval leye = makeEye(scr_w/2 - HEAD_WIDTH/4, scr_h/2 - HEAD_HEIGHT/4);
		GOval reye = makeEye(scr_w/2 + HEAD_WIDTH/4, scr_h/2 - HEAD_HEIGHT/4);		
		
		GRect mouth = new GRect((scr_w - MOUTH_WIDTH) / 2, (scr_h - MOUTH_HEIGHT) / 2 + HEAD_HEIGHT / 4, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		
		GCompound face = new GCompound(); //face = all parts of head together
		
		face.add(head);
		face.add(leye);
		face.add(reye);
		face.add(mouth);
		add(face);
		
		//randomly jiggle face around screen
		while (face.getY() < scr_h && face.getX() < scr_w) {
			pause(40); // pause 40 ms to display proper frame rate
			face.move(rgen.nextInt(-5, 5), rgen.nextInt(-5, 5)); //move random x, y values between (+/-5, +/-5)		
		}
	}
	
	private GOval makeEye(double cx, double cy) {
		double x = cx - EYE_RADIUS;
		double y = cy - EYE_RADIUS;
		GOval eye = new GOval(x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFilled(true);
		eye.setColor(Color.YELLOW);
		return eye;
	}
}
