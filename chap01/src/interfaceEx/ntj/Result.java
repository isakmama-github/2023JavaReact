package interfaceEx.ntj;

public class Result implements Television, Computer, Notebook {

	@Override
	public void turnOn(String str) {
		System.out.println(str + "를 켠다");	
	}

	@Override
	public void turnOff(String str) {
		System.out.println(str + "를 켠다");
	}
	@Override
	public void repair() {
		System.out.println("장비를 수리한다.");
		
	}

	@Override
	public void initFac() {
		System.out.println("장비를 초기화한다.");
		
	}

}
