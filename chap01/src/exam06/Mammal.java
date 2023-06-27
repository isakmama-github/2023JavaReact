package exam06;

public class Mammal extends Animal{
	
	public Mammal() {
		super("사자");
		System.out.println("포유류 : 사자");
		
	}
	
	public Mammal(String s) {
		super(s);
		System.out.println("포유류 " + s);
	}

}
