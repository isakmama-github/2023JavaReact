package exam06;

public class ComputerTest {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calc = new Calculator();
		System.out.println("원면적 : "+ calc.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println("원면적 : " + com.areaCircle(r));
	}

}
