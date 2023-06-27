package practice.ex03;

public class DiceTest {
	public static void main(String[] args) {
		System.out.println(Math.random());
		Dice d6 = new Dice(6);
		Dice d20 = new Dice(20);
		
		for(int i = 0; i<5; i++) {
			d6.rollingDice();
			System.out.println(d6.diceNumS);
		}
		for(int i = 0; i<5; i++) {
			d20.rollingDice();
			System.out.println(d20.diceNumS);
		}
	}
}