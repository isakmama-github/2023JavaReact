package interfaceEx.psh;

public class Tv implements Products {

	@Override
	public void turnOn() {
		System.out.println("Tv on!");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv off!");
	}

}
