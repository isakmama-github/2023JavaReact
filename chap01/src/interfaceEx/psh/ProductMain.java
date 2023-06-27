package interfaceEx.psh;

public class ProductMain {

	public static void main(String[] args) {
		
		Tv tv =new Tv();
		Products pro = new Computer();
		Labtob lab = new Labtob();
		
		Computer com2 = (Computer)pro;
		
		tv.turnOn();
		tv.turnOff();
		tv.reset();
		tv.repair();
		System.out.println();

		com2.turnOn();
		com2.turnOff();
		com2.reset();
		com2.repair();
		System.out.println();

		lab.turnOn();
		lab.turnOff();
		lab.reset();
		lab.repair();
		
	}

}
