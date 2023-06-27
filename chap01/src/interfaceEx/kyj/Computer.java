package interfaceEx.kyj;

public class Computer implements Interface{

	@Override
	public void turnOn() {
		System.out.println("컴퓨터 전원을 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터 전원을 끕니다.");
	}

	@Override
	public void reset() {
		System.out.println("장비를 초기화합니다.");
	}

}
