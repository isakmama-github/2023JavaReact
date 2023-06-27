package interfaceEx.kj;

public class Computer implements Products {
	
	@Override
	public void turnOn() {
		 System.out.println("컴퓨터를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 끕니다.");
	}

	@Override
	public void reset() {
		System.out.println("장비를 초기화 합니다.");
		
	}

}
