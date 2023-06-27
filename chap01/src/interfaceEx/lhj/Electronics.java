package interfaceEx.lhj;

public interface Electronics {
	void turnOn();
	void turnOff();
	default void repair() {
		System.out.println("장비를 수리합니다.");
	}
	default void reset() {
		System.out.println("장비를 초기화합니다.");
	}
}
