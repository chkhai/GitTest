import acm.program.ConsoleProgram;

public class meotxeAmocana extends ConsoleProgram {

	public void run() {
		int a = readInt("Enter integer: ");
		int b = readInt("Enter integer: ");
		calculatePithagoraemTheorem(a, b);
	}

	private double calculatePithagoraemTheorem(int a, int b) {
		double y = Math.sqrt(a*a +b*b);
		return y;
	}
}
