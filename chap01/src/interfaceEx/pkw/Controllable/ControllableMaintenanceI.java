package interfaceEx.pkw.Controllable;

public interface ControllableMaintenanceI {
	default void repair() {
		System.out.println("수리");
	}
	public void init();
}
