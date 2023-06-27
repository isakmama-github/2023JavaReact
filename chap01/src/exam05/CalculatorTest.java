package exam05;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		int rec1 = myCalc.areaRectangle(50);
		System.out.println("정사각형의 넓이 : "+ rec1);
		
		System.out.println(
				"직사각형의 넓이 : " + myCalc.areaRectangle(10, 30));
	
	}

}
