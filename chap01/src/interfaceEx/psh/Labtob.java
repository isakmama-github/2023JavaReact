package interfaceEx.psh;

public class Labtob implements Products {

	@Override
	public void turnOn() {
		System.out.println("노트북 On!");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북 Off!");

	}

	public void reset() {
		System.out.println("ദ്ദി ᵔ∇ᵔ )노트북 초기화중!");

	}
	public void repair() {
		System.out.println("ദ്ദി ᵔ∇ᵔ )노트북 수리중!");
	}

}
