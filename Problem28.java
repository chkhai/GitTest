import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram{
	private static final int q = -1;
	
	public void run() {
		int count = 0;
		while(true){
			int n = readInt("Enter integer: ");
			if(n % 2 ==0){
				if(n == q){
					break;
				}
				count += count;
			}
		}
		println(count);
	}
}