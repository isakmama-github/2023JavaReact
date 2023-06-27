package interfaceEx.kyr;

public interface Electronic {
	// 모든 전자제품에 대한 명시
	public void turnOn(); // 전자제품 켜기 구현 명시
	public void turnOff(); // 전자제품 끄기기 구현 명시
	
	// 공장초기화
	static void factoryReset() {
		System.out.println("장비를 초기화한다.");
	}; 
	
	// 전자제품 수리 기능
	/*
	 * default 아닌 static 앞에 사용시, 인터페이스에서는 문제가 없으나 다른 예외가 발생
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The method repair() of type EletronicProduct must override or implement a supertype method
	 */
	 static void repair() { 
//	default void repair() { 
		System.out.println("장비를 수리한다.");
	} 
}
