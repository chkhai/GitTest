import acm.program.ConsoleProgram;

public class Problem19 extends ConsoleProgram{
	
//კონსოლიდან წაიკითხეთ მთელი რიცხვი n და შემდეგ n ჯერ დაბეჭდეთ “hello ” + i, სადაც i
//	იცვლება 0 დან n-1 მდე.
	public void run() {
		int n = readInt("Enter real number");
		for (int i =0; i < n; i++) {
			println(i);
		}
	}
}
