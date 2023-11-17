import acm.graphics.GLine;
import acm.program.GraphicsProgram;

	import acm.graphics.*;
	import acm.program.GraphicsProgram;

	public class Problem13 extends GraphicsProgram {

		/** Width of each bricks in pixels */
		private static final int BRICK_WIDTH = 30;

		/** Width of each bricks in pixels */
		private static final int BRICK_HEIGHT = 12;

		/** Number of each bricks in the base of the pyramid */
		private static final int BRICKS_IN_BASE = 14;

		public void run() {
			for (int i = 1; i < BRICKS_IN_BASE + 1; i++) {
				makeHorizontalRowOfBricks(i);
			}
		}

		/*
		 * This method helps us build horizontal row of bricks. x and y are the
		 * coordinates of the first brick in the row. After creating the first
		 * brick, x coordinate increases by BRICK_WIDTH, y coordinate stays the same
		 * since its the same row. In one row we have to build BRICKS_IN_BASE-i+1
		 * bricks.
		 */
		private void makeHorizontalRowOfBricks(int i) {
			double x = getWidth() / 2 - BRICK_WIDTH * (BRICKS_IN_BASE - i) / 2;
			double y = getHeight() - i * BRICK_HEIGHT;
			for (int j = 0; j < BRICKS_IN_BASE + 1 - i; j++) {
				GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(rect);
				x = x + BRICK_WIDTH;
			}
		}
	}

//	public void run() {
//		drawMiddleLine();
//	}
//
//	private void drawMiddleLine() {
//		double x1 = 0;
//		double y1 = getHeight() / 2;
//		double x2 = getWidth();
//		double y2 = y1;
//		GLine line = new GLine(x1, y1, x2, y2);
//		add(line);
//	}

