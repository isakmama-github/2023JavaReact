package interfaceEx.kyj;

public class Tv implements Interface{

	@Override
	public void turnOn() {
		System.out.println("TV의 전원을 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV의 전원을 끕니다.");
	}

	@Override
	public void reset() {
		System.out.println("장비를 초기화 합니다.");
	}
	
//	public void repair() {System.out.println("장비를 수리합니다.");}

}
