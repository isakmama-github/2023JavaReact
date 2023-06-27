package exam05.ex01;

public class CalculatorTest {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 50);
		int result3 = Calculator.minus(50,  10);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);

	}

}
