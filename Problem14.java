import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem14 extends GraphicsProgram{
	
	public void run() {
		drawRobot();
	}

	private void drawRobot() {
		double x1 = getHeight() / 2 - 100;
		double y1 = getWidth() / 2 - 100;
		double x2 = 400;
		double y2 = 400;
		GRect face = new GRect(x1, y1, x2, y2);
		add(face);
	}
}
