package exam04;

public class GasCarTest {

	public static void main(String[] args) {
		GasCar myCar = new GasCar();
		
		myCar.setGas(10);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없어요.");
		}else {
			System.out.println("gas를 주입하세요.");
		}

	}

}
