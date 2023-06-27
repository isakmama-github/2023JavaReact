package exam05;

public class Singleton {

	//필드
	private static Singleton st = new Singleton();
	// 생성자
	private Singleton() {
		
	}
	
	// 메소드
	static Singleton getInstance(){
		return st;
		
	}
	
}
