import acm.program.ConsoleProgram;
//მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს n ის გამყოფების
//რაოდენობა
public class Problem24 extends ConsoleProgram{
	public void run() {
		int n = readInt("Enter real number: ");
		int k = 0;
		for(int i = 1; i < n+1; i++) {
			if(n % i == 0){
				k = k + 1;
			}
			println(k);
		}
	}
}
