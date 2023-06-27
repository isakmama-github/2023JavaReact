package exam05.ex02;

// ctrl+shift+o
import exam05.hankook.SnowTire;
import exam05.hankook.Tire;
import exam05.hyundai.Engine;
import exam05.kumho.BigWireTire;

public class Car {
	public static void main(String[] args) {
	   Engine engine = new Engine();
//	   engine.engineType();
//	   int a = engine.a;
	   SnowTire snowTire = new SnowTire();
	   BigWireTire bwt = new BigWireTire();
	   
	   Tire tire = new Tire();
//	   int count = tire.count();      // private인 멤버는 접근불가
	   int count = tire.getCount();   // getXXX() 만들어서 꺼내준다.
	   tire.setCount(10);
	   System.out.println(tire.getCount());
	   
	   
	   exam05.kumho.Tire tire2 = new exam05.kumho.Tire();
	}
}
