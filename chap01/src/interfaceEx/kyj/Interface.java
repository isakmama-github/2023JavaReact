package interfaceEx.kyj;

public interface Interface {
	
	void turnOn();
	void turnOff();
	void reset();
	default void repair() {System.out.println("장비를 수리합니다.");}
	
}
