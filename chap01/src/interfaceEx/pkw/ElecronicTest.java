package interfaceEx.pkw;

import interfaceEx.pkw.implement.Computer;
import interfaceEx.pkw.implement.ElecTv;
import interfaceEx.pkw.implement.Electronic;
import interfaceEx.pkw.implement.Laptop;
import interfaceEx.pkw.implement.Maintenance;

public class ElecronicTest {
	public static void main(String[] args) {
		Maintenance re = new Maintenance();
		re.repair();
		re.init();
		
		Electronic elec = new Electronic();
		Electronic tv = new ElecTv();
		Electronic com = new Computer();
		Electronic lap = new Laptop();
		
		System.out.println("--------------------------------------");
		elec.turnOn();
		elec.turnOff();
		elec.init();
		elec.repair();
		
		tv.repair();
		tv.init();

		com.repair();
		com.turnOff();
		
		lap.turnOn();
		lap.repair();
	}
}