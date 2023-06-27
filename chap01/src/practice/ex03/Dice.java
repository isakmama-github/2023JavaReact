package practice.ex03;

public class Dice {
	int diceNumS;
	int d;
	
	Dice(int d){
		this.d = d;
	}

	public void rollingDice() {
//		diceNumS = ((int)(Math.random() * 100) % 6 +1);
		diceNumS = ((int)(Math.random() * d) +1);
	}
}
