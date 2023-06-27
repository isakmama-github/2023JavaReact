package exam07;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolumn(80);
		rc.turnOff();
		
		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc2 = tv;
		Searchable sb = tv;
		
	}

}
