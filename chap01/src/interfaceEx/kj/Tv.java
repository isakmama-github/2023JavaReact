package interfaceEx.kj;

public class Tv  implements Products {
	
	public void repire() {
		
	}
	public void reset() {
		System.out.println("장비를 초기화 합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켜다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끄다");
		
	}
	
	
}
