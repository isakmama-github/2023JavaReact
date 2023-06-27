package exam04;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		
		calc1.powerOn();
		int result = calc1.plus(100, 200);
		System.out.println(result);
		
		double result2 = calc1.divide(100, 200);
//		double result2 = calc1.divide(100.0, 200.0);
		System.out.println(result2);
		
		calc1.powerOff();
	}
}
