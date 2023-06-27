package interfaceEx.kgs;

public interface Controlable2 {

	default void repair() {
		System.out.println("장비 수리.");
	}
	void factoryReset();
}
