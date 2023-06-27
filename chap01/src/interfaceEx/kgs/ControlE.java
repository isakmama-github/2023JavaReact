package interfaceEx.kgs;

public class ControlE {

	
	public void turnOn(Controlable ca) {
		ca.turnOn();
//		if (ca instanceof Tv) {
//			Tv t1 = (Tv) ca;
//			t1.turnOn();
//		}			
//		else if (ca instanceof Computer)
//			((Computer) ca).turnOn();
//		else if (ca instanceof Notebook)
//			((Notebook) ca).turnOn();
	}

	public void turnOff(Controlable ca) {
		ca.turnOff();
//		if (ca instanceof Tv)
//			((Tv) ca).turnOff();
//		else if (ca instanceof Computer)
//			((Computer) ca).turnOff();
//		else if (ca instanceof Notebook)
//			((Notebook) ca).turnOff();
	}
	
	public void repair(Controlable2 ca) {
		ca.repair();
	}
	public void factoryReset(Controlable2 ca) {
		ca.factoryReset();
	}
}
