import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problemhome extends GraphicsProgram{
	private static final double PI=3.14;
	public void run(){
		drawMidLine();
	}

	private void drawMidLine() {
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y2 = y1;
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
	}
	
}
