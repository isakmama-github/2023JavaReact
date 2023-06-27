package interfaceEx.kj;

public interface Products {
	
	default void repire() {
		System.out.println("장비를 수리합니다.");
	}
		
	public void reset();
	
	public void turnOn();
	
	public void turnOff();
	
}
