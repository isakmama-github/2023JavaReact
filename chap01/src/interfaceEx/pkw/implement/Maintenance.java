package interfaceEx.pkw.implement;

import interfaceEx.pkw.Controllable.ControllableMaintenanceI;

public class Maintenance implements ControllableMaintenanceI {
	//public void repair(){};
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("초기화");
	}
}
