package interfaceEx.psh;

public interface Products {
	
	public void turnOn();
	public void turnOff();
	default void reset() {
		System.out.println("장비 초기화");
	};
	default void repair() {
		 System.out.println("장비 수리중");
	 };
}
