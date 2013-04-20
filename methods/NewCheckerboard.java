/*
 * File: NewCheckerboard.java
 * --------------------------
 * This program draws a checkerboard.
 */

import acm.graphics.*;
import acm.program.*;

/*
 * This class draws a checkerboard on the graphics window.
 * The size of the checkerboard is specified by the
 * constants NROWS and NCOLUMNS, and the checkerboard fills
 * the vertical space available.
 */

public class NewCheckerboard extends GraphicsProgram {

	/* Number of rows */
	private static final int NROWS = 8;

	/* Number of columns */
	private static final int NCOLUMNS = 8;
	
	/* Runs the program */
	public void run() {
		int sqSize = getHeight() / NROWS;
		for (int i = 0; i < NROWS; i++) {
			drawRow(i, sqSize);
		}
	}

	/*
	 * Draws the row of squares in checkboard given
	 * by index rowNum.  size is size of squares.
	 * 
	 * Preconditions:
	 *    1) 0 <= rowNum < NROWS
	 *    2) size <= getHeight() and size <= getWidth()
	 *    In a sense, these preconditions are not necessary, as if
	 *    they are violated, the drawing just doesn't look right
	 * Postcondition: A row of a checkerboard is drawn
	 */
	public void drawRow(int rowNum, int size) {
		int y = rowNum * size;
		for(int i = 0; i < NCOLUMNS; i++) {
			int x = i * size;
			drawSquare(x, y, size, ((rowNum + i) % 2 != 0));
		}
	}

	/*
	 * Draws one square of the given size with upper
	 * left-hand coordinates (x, y).  filled determines
	 * if the square is filled or not.
	 */
	public void drawSquare(int x, int y, 
			   int size, boolean filled) {
		GRect sq = new GRect(x, y, size, size);
		sq.setFilled(filled);
		add(sq);
	}
}
