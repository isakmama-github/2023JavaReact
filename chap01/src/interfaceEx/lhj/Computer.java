package interfaceEx.lhj;

public class Computer implements Electronics {

	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 끕니다.");
	}

	@Override
	public void repair() {
		System.out.println("컴퓨터를 수리합니다.");
	}

	@Override
	public void reset() {
		System.out.println("컴퓨터를 초기화합니다.");
	}

}
