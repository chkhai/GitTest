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

import acm.graphics.*;
import acm.program.GraphicsProgram;


public class Pyramid extends GraphicsProgram {
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private static final int BRICKS_IN_BASE = 14;

	public void run() {
		for (int i = 1; i < BRICKS_IN_BASE + 1; i++) {
			makeHorisontalRowOfBricks(i);
		}
	}

	private void makeHorisontalRowOfBricks(int i) {
		double x = getWidth() / 2 - BRICK_WIDTH * (BRICKS_IN_BASE - i) / 2;
		double y = getHeight() - i * BRICK_HEIGHT;
		for (int j = 0; j < BRICKS_IN_BASE + 1 - i; j++) {
			GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
			add(rect);
			x = x + BRICK_WIDTH;
		}
	}
}
