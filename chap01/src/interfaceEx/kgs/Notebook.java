package interfaceEx.kgs;

public class Notebook extends RepairReset implements Controlable{

	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다.");
	}
	
	@Override
	public void repair() {
		System.out.println("노트북을 수리합니다.");
	}
}
