import acm.graphics.*;
import acm.program.GraphicsProgram;

//not finished
public class pirveliAmocana extends GraphicsProgram {
	private static final int BRICK_WIDTH = 32;
	private static final int BRICK_HEIGHT = 15;
	private static final int BRICKS_IN_BASE = 14;

	public void run() {
		for(int i = 0; i < BRICKS_IN_BASE; i++) {
			makeHorisontalRowOfBricks(i);
		}
	}

	private void makeHorisontalRowOfBricks(int i) {
		double x = getWidth() / 2 - BRICK_WIDTH * (BRICKS_IN_BASE - i)/ 2;
		double y = getHeight() - i * BRICK_HEIGHT;
		for(int j = 0; j < BRICKS_IN_BASE; j++){
			GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);	
			add(rect);
			x = x + BRICK_WIDTH;
		}
	}
}
