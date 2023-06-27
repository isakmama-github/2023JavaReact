package interfaceEx.kj;

public class Laptop implements Products {

	@Override
	public void turnOn() {
		System.out.println("노트북을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끕니다.");

	}

	@Override
	public void reset() {
		System.out.println("장비를 초기화 합니다.");
		
	}

}
