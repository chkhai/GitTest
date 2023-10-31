import acm.program.ConsoleProgram;

public class Problem30 extends ConsoleProgram{
	public void run() {
		int n = readInt ("Enter n: ");
		int reversedN = reverse(n);
		println(reversedN);
	}

	private int reverse(int n) {
		int reversedNum = 0;
		while(n != 0) {
			int lastDigit = n % 10;
			n /= 10;
			//print(lastDigit);
			
			reversedNum = reversedNum * 10 + lastDigit;
			
			
		}
		return reversedNum;
	}
}
