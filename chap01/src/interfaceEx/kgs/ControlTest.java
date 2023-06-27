package interfaceEx.kgs;

public class ControlTest {

	public static void main(String[] args) {
		
		ControlE ce = new ControlE();
		
		Tv tv = new Tv();
		ce.turnOn(tv);
		ce.turnOff(tv);
		ce.repair(tv);
		
		Computer cp = new Computer();
		ce.turnOn(cp);
		ce.turnOff(cp);
		
		Notebook nb = new Notebook();
		ce.repair(nb);
		ce.factoryReset(nb);
		
	}
}
