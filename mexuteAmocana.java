import acm.program.ConsoleProgram;
//not finished
public class mexuteAmocana extends ConsoleProgram{
	private static final int SENTINEL = 0;
	public void run() {
		println("This program finds smallest and largest numbers. ");
		int k = readInt("? ");
		int max = k;
		int min = k;
	/*	while(k != SENTINEL){
			int m = readInt("? ");
			if(m == SENTINEL){
				break;
			}
			if(m > max){
				max = m; 
			}	
			if(m < min){
				min = m;
			}
		} */
		int findMax=compareMandMax(max);
		int findMin=compareMandMin(min);
		println("largest: " + max);
		println("smallest: " + min);
	}
	private int compareMandMax(int max) {
		int m = readInt("? ");
		if(m == SENTINEL){
			println("not" + SENTINEL);
		}
		if(m > max){
			max = m; 
		}
		return max;
	}
}