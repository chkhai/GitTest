import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
//თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო
public class Problem35 extends ConsoleProgram{
	private static final int NUM_EXPERIMENTS = 10000;
	private RandomGenerator rgen = RandomGenerator.getInstance(); 
	public void run() {
		double sumFlips = 0;
		for(int i = 0; i < NUM_EXPERIMENTS; i++) {
			int currFlips = holdExperiment();
			sumFlips += currFlips;
		}
		double avgFlips = sumFlips / NUM_EXPERIMENTS;
	}
	private int holdExperiment() {
		int munFlips = 0;
		while(true){
			boolean is Heads = rgen.nextBoolean();
		}
		return 0;
	}
}
