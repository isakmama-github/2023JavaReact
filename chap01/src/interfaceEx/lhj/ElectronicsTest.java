package interfaceEx.lhj;

public class ElectronicsTest {

	public static void main(String[] args) {
		Electronics el = new Television();
		Electronics el2 = new Computer();
		Electronics el3 = new Notebook();
		
		el.turnOn();
		el.repair();
		el.reset();
		el.turnOff();
		
		el2.turnOn();
		el2.repair();
		el2.reset();
		el2.turnOff();
		
		el3.turnOn();
		el3.repair();
		el3.reset();
		el3.turnOff();
	}

}
