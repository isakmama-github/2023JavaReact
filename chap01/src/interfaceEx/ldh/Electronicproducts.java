package interfaceEx.ldh;

public interface Electronicproducts {
	public void turnOn();
	
	public void turnOff();
	
	default void repair() {
		System.out.println("공장을 수리합니다.");
	}
	
	public void reSet();
	
}
