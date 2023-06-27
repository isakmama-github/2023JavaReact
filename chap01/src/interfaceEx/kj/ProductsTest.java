package interfaceEx.kj;

public class ProductsTest {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer com = new Computer();
		Laptop lap = new Laptop();
		
		Products pro = new Laptop();
		Laptop lap2 = (Laptop)pro;
		
		
		
		
		tv.turnOn();
		tv.turnOff();
		tv.repire();
		com.turnOn();
		com.turnOff();
		com.repire();
		com.reset();
		
		
	}

}
