package interfaceEx.ldg;

public class ElectronicMarchine extends ComputerUse{

	public static void main(String[] args) {
		
		Marchine el1 = new ComputerUse(); // 머신 인터페이스에서 el1이라는 변수안에 컴터유즈를 만듬
		Marchine el2 = new TelevisionUse(); //// 머신 인터페이스에서 el2이라는 변수안에 티비유즈를 만듬
		
		el1.turnOn();
		el1.turnOff();
//		Marchine.reset();
		el1.repair();
		el2.turnOn();
		el2.turnOff();
		el2.repair();
		Marchine.reset(); // 리셋은 정적메소드로 만들어서 바로 출력 ㄱㄱ

		//하나씩 다 불러서 호출
	}

}
