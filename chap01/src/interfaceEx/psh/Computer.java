package interfaceEx.psh;

public class Computer implements Products {

	@Override
	public void turnOn() {
		System.out.println("컴퓨터 On!");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터 Off!");
	}

	@Override
	public void reset() {
		System.out.println("ദ്ദി ᵔ∇ᵔ ) 컴퓨터 초기화하는중!");
	}

	
}
