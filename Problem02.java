import stanford.karel.Karel;

/*
 * კარელი დგას 1x1 უჯრაზე. 5x1 უჯრაზე დევს 10 ცალი ბრილიანტი, კარელმა ათივე
ბრილიანტი უნდა გადაიტანოს 6x1 უჯრაზე.
 */

public class Problem02 extends Karel{
	
	
	public void run (){
		while(noBeepersPresent()){
			move();
		}
		for(int i=0; i<10; i++){
			pickBeeper();
			move();
			putBeeper();
			turnLeft();
			turnLeft();
			move();
			turnLeft();
			turnLeft();
			
		}
		}
	}
	