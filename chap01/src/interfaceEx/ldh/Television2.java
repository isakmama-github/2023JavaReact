package interfaceEx.ldh;

public class Television2 implements Electronicproducts{

	@Override
	public void turnOn() {
		System.out.println("Tv전원을킵니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Tv전원을끕니다.");
	}
	@Override
	public void reSet() {
		System.out.println("Tv를 공장초기화 합니다.");
	}
	
}
