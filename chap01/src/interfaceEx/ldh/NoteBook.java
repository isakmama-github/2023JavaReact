package interfaceEx.ldh;

public class NoteBook implements Electronicproducts{

	@Override
	public void turnOn() {
		System.out.println("노트북 전원을킵니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("노트북 전원을끕니다.");
	}
	@Override
	public void reSet() {
		System.out.println("노트북을 공장초기화 합니다.");
	}

}
