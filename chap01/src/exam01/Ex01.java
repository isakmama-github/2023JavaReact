package exam01;

public class Ex01 {
	
	public  void a01() {
		b01();
		String v01 = "a01()입니다.";
		System.out.println(v01);
	}
	
	public  void b01() {
		int v01 = 100;
		System.out.println("b01()입니다.");
		System.out.println("v01은 " + v01 + "입니다.");
	}

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		System.out.println("Hello world~");
		int x;
		x = 100;
		int y = 200;
		int result = x + y;
		
		System.out.println("x + y = " + result);
		System.out.println(x + "+" + y + " = " + result);
	    
		ex01.a01();
		System.out.println("main 메소드입니다.");
		
		
		// a01에서 선언된 변수는 사용할 수 없다.
		//System.out.println(v01);

	}

}
