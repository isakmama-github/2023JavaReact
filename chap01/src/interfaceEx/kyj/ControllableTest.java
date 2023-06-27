package interfaceEx.kyj;

public class ControllableTest {

	public static void main(String[] args) {
		Laptop myLapTop = new Laptop ();
		Tv myTv = new Tv();
		Computer myComputer = new Computer();
		
		myTv.turnOn();
		myTv.turnOff();
		myTv.repair();
		myComputer.turnOn();
		myComputer.turnOff();
		myComputer.reset();
		myComputer.repair();
	}

}
