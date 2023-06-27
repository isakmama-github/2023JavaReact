package interfaceEx.kyj;

public class Laptop implements Interface{

	@Override
	public void turnOn () {
		System.out.println("노트북을 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끕니다.");
	}

	@Override
	public void reset() {
		System.out.println("장비를 초기화합니다.");
	}

}
