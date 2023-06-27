package interfaceEx.lhj;

public class Notebook implements Electronics {

	@Override
	public void turnOn() {
		System.out.println("노트북을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끕니다.");
	}

	@Override
	public void repair() {
		System.out.println("노트북을 수리합니다.");
	}

	@Override
	public void reset() {
		System.out.println("노트북을 초기화합니다.");
	}

}
