import acm.program.ConsoleProgram;
//not finished
public class Problem28 extends ConsoleProgram{
	private static final int q = -1;
	
	public void run() {
		int count = 0;
		checkEvens(count);

		println(count);
	}

	private int checkEvens(int count) {
		while(true){
			int n = readInt("Enter integer: ");
			if(n % 2 ==0 && n != q){
				count += count;
			}
		return count;
		}
	}
}