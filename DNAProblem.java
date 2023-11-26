import acm.program.ConsoleProgram;

//SPOILER ALERT! თქვენი ამოცანაა დაადგინოთ არის თუ არა ლუკა ანაკინის შვილი. ამისათვის თქვენ გადმოგეცემათ ლუკას და ანაკინის DNA ნიმუშები (ორი სტრინგი). ეს ნიმუშები ერთმანეთს უნდა შეადაროთ და იპოვოთ მაქსიმალური სიგრძის
//ზუსტი დამთხვევა რომელიც ორივე DNA-ს ნიმუშში გვხვდება. თუკი მაქსიმალური
//სიგრძის დამთხვევის სიგრძე(სიმბოლოების რაოდენობა) მეტია ანაკინის DNA-ს
//სიგრძის ნახევარზე მაშინ ლუკა ანაკინის შვილია წინააღმდეგ შემთხვევაში არ
//არის. დაწერეთ მეთოდი amIYourFatherLuke რომელსაც გადაეცემა ორი სტრინგი და
//აბრუნებს boolean-ს.ანუ თქვენ უნდა იპოვოთ ორ სტრინგში მაქსიმალური სიგრძის
//ქვესტრინგი, რომელსაც ორივე სტრინგი შეიცავს. მაგალითად:

public class DNAProblem extends ConsoleProgram {

	private int length;
	
	private int count;
	
	private char ch;
	
	private char chch;

	public void run() {
		String anakin = readLine("Enter Anakin's DNA: ");
		String luke = readLine("Enter Luke's DNA: ");
		if (amIYourFatherLuke(anakin, luke)) {
			println("Anakin is Luke's father.");
		} else {
			println("Anakin isn't Luke's father.");
		}
	}

	private boolean amIYourFatherLuke(String anakin, String luke) {
		for (int i = 0; i < anakin.length() - 1; i++) {
			ch = anakin.charAt(i);
			for (int j = 0; j < luke.length() - 1; j++) {
				chch = luke.charAt(j);
				if (ch == chch) {
					length = checkTheLengthOfSamePart(anakin, luke, ch, chch, i, j);
					if (length > (anakin.length() / 2)) {
						return true;
					}
				}
			}
		}
		return false;

	}

	private int checkTheLengthOfSamePart(String anakin, String luke, char ch, char chch, int i, int j) {
		System.out.println("true");
		count = 1;
		for(int m = 0; m < anakin.length()-i-1; i++){
			if(anakin.charAt(m) == luke.charAt(j)){
				count++;
				j++;
			}
		}
		return count;
	}

}
