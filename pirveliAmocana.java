import acm.graphics.*;
import acm.program.GraphicsProgram;

//not finished
public class pirveliAmocana extends GraphicsProgram {
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private static final int BRICKS_IN_BASE = 14;

	public void run() {
		for(int i = 0; i < BRICKS_IN_BASE; i++) {
			makeHorisontalRowOfBricks();
		}
	}

	private void makeHorisontalRowOfBricks() {
		for(int j = 1; j < BRICKS_IN_BASE + 1; j++){
			if(j % 2 != 0){
				double x = getWidth() / 2 - BRICK_WIDTH * j;
				double y = getHeight() - j * BRICK_HEIGHT;
				GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(rect);
			} else {
				double x = getWidth() / 2 - BRICK_WIDTH / 2 - j * BRICK_WIDTH;
				double y = getHeight() - j * BRICK_HEIGHT;
				GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(rect);
			}
		}
	}
}
