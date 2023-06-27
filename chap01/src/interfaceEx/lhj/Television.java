package interfaceEx.lhj;

public class Television implements Electronics {
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

//	@Override
//	public void repair() {
//		System.out.println("TV를 수리합니다.");
//	}

//	@Override
//	public void reset() {
//		System.out.println("TV를 초기화합니다.");
//	}

}
