import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem14 extends GraphicsProgram{
	
	public void run() {
		drawFace();
		drawLeftEye();
	}

	private void drawLeftEye() {
		double x1 =150;
		double y1 =150;
		double x2 =50;
		double y2 =50;
		GRect eye = new GRect(x1, y1, x2, y2);
	}

	private void drawFace() {
		double x1 = getHeight() / 2 - 50;
		double y1 = getWidth() / 2 - 300;
		double x2 = 300;
		double y2 = 300;
		GRect face = new GRect(x1, y1, x2, y2);
		add(face);
	}
}
