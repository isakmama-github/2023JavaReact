package interfaceEx.ksm;

public interface Elect {
	void turnOn();
	
	void turnOff();
	
	default void repair() {
		System.out.println("장비 수리한다");
	};
	
	void clear();
}
