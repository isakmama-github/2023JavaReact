package interfaceEx.agh;

public class Control extends ElectronicMethod implements Electric{

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	
	
	

}
