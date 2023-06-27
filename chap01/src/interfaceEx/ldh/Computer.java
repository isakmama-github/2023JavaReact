package interfaceEx.ldh;

public class Computer implements Electronicproducts{
	
	@Override
	public void turnOn() {
		System.out.println("컴퓨터 전원을킵니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("컴퓨터 전원을끕니다.");
	}
	@Override
	public void reSet() {
		System.out.println("컴퓨터를 공장초기화 합니다.");
	}
}
