package exam07;

public class MyClassTest {

	public static void main(String[] args) {

		MyClass myClass = new MyClass();
		System.out.println(myClass);
		myClass.rc.turnOn();
		myClass.rc.setVolumn(5);
		
		System.out.println();
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println();
		
		myClass.methodA();
		System.out.println();
		
		myClass.methodB(new Television());
		
	}

}
