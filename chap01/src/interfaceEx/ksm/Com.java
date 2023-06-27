package interfaceEx.ksm;

public class Com implements Elect {

	@Override
	public void turnOn() {
		System.out.println("com를 켠다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("com를 끈다");
		
	}

	@Override
	public void clear() {
		System.out.println("장비를 초기화 한다");
		
	}
}
