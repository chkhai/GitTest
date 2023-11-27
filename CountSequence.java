import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//წარმოიდგინეთ შემდეგი მიმდევრობა. მიმდევრობის პირველი წევრი ნატურალური რიცხვი n-ია. 
//იმისათვის, რომ შემდეგი წევრი მივიღოთ უნდა ავაგდოთ მონეტა. მონეტის აგდების შედეგად თუკი 
//ამოვიდა გერბი მაშინ შემდეგი წევრია n/2(მთელი რიცხვების გაყოფა), ხოლო თუკი ამოვიდა საფასური 
//მაშინ შემდეგი წევრია n-1. მიმდევრობის ყოველი შემდეგი წევრიც იგივე წესებით მოიცემა - მიმდევრობის 
//წინა წევრს ან ორზე ვყოფთ ან ერთს ვაკლებთ. ასე ვაგრძელებთ მანამ სანამ არ მივიღებთ 0-ს. 
//თქვენი ამოცანაა დაწეროთ მეთოდი countSequence რომელსაც გადაეცემა მიმდევრობის პირველი წევრი n და
//რომელიც აბრუნებს საშუალოდ რამდენი წევრი აქვს მიმდევრობას. გაითვალისწინეთ, რომ ამ ამოცანაში საკვანძო 
//სიტყვაა საშუალოდ. შედეგის გამოსათვლელად თქვენ უნდა ჩაატაროთ ექსპერიმენტები. 
//ყოველ ექსპერიმენტზე უნდა დაიწყოთ n-იდან მოახდინოთ სიმულაცია ჩვენი წესების და მიიღოთ მიმდევრობის სიგრძე.
//საკმარისი რაოდენობის(EXPERIMENT_COUNT) ექსპერიმენტის ჩატარების შემდეგ თქვენ შეგიძლიათ გამოთვალოთ 
//საშუალოდ რამდენი წევრი აქვს n-ით დაწყებულ მიმდევრობას. 

public class CountSequence extends ConsoleProgram{
	
	private static final int NUM_EXP=1000;
	
	private int n;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		n = 100;
		int sumExp = 1;
		for(int i = 0; i < NUM_EXP; i++){
			while(n!=0){
				if(rgen.nextBoolean()){
					n = n / 2;
					System.out.println("bla");
				}else{
					n = n-1;
				}
				sumExp++;
			}
		}
		int avgSum = sumExp / NUM_EXP;
		println(avgSum);
	}
}
