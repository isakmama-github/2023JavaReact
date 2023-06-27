package interfaceEx.agh;

public class TV extends Control {

	@Override
	public void repair() {
		System.out.println("TV에 수리가 필요합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	

}
