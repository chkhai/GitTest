import acm.program.ConsoleProgram;

public class Problem20 extends ConsoleProgram {
	//კონსოლიდან წაიკითხეთ n, შემდეგ წაიკითხეთ n ცალი მთელი რიცხვი და დაბეჭდეთ ჯამი
	public void run() {
		int n = readInt("Enter real number :");
	
		for (int i = 0; i < n; i++) {
			int num = readInt("Enter number #" + i + ": ");
			
			println(num);
		}
	}
}
