package interfaceEx.kyr;

public class EletronicProduct implements Electronic {
	String name;
	
	EletronicProduct(String name) {
		this.name = name;
	}
	
	@Override
	public void turnOn() {
		System.out.println(name + "를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println(name + "를 끕니다.");		
	}
	
	// 전자제품 수리 기능
	
	public void repair() { 
		System.out.println("장비(" + name + ")를 수리한다.");
	}
	
	
	public void factoryReset() { 
		System.out.println("장비(" + name + ")를 수리한다.");
	} 
	

//	@Override
	// 직접 인터페이스에서 구현하는걸로 수정
//	public void fix() {
//		System.out.println(name + "을 수리합니다.");
//	}
//
//	@Override
	// 직접 인터페이스에서 구현하는걸로 수정
//	public void factoryReset() {
//		System.out.println(name + "을 공장초기화 합니다.");
//	}
}
