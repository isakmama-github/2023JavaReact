package interfaceEx.ntj;

public interface Electro {
	public void turnOn(String str);
	public void turnOff(String str);
	default void repair() {
		System.out.println("장비를 고칩니다.");
	};
	public void initFac();
}
