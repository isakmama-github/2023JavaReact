package interfaceEx.pkw.implement;

import interfaceEx.pkw.Controllable.ControllableElectronic;

public class Electronic extends Maintenance implements ControllableElectronic {
	//public void repair(){};
	//public void init(){};
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켬");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끔");
	}
}
