package interfaceEx.lht;

public interface Interface {
	
	void turnOn();
	void turnOff();
	void renew();
	default void repair() {
		System.out.println("수리 중입니다.");
	};
	
}
