package interfaceEx.ntj;

public class ElectroTest {

	public static void main(String[] args) {

		Result rc = new Result();
		
		Television tv = rc;
		Computer  com = rc;
		
		tv.turnOn(Television.TELEVISION);
		tv.turnOff(Television.TELEVISION);
		tv.repair();
		com.turnOn(Computer.COMPUTER);
		com.turnOff(Computer.COMPUTER);
		com.repair();
		com.initFac();
	}

}
