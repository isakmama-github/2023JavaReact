package exam08;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 10;
		b.method1();
		
		//
		A.C c= new A.C();
		c.field1 = 100;
		c.method1();
		
		A.C.field2 = 300;
		A.C.method2();
		
		a.method();
		
		
	}

}
