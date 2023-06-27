package interfaceEx.ksm;

public class Tv implements Elect {

	@Override
	public void turnOn() {
		System.out.println("tv를 켠다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끈다");
		
	}

	@Override
	public void clear() {
		System.out.println("장비를 초기화 한다");
		
	}

	

}
