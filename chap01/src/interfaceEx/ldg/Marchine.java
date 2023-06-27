package interfaceEx.ldg;

public interface Marchine {
	public void turnOn();  //오버라이딩
	public void turnOff(); //오버라이딩 
	
	default void repair() { // 디폴트로 접근제한자 선언
		System.out.println("장비를 수리한다.");
	}
	
	static void reset() { //정적 메소드로 만들어서 얘는 바로 끌 어다 사용가능
		System.out.println("장비를 초기화한다.");
	}

}
