package interfaceEx.lht;

public class EProductTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		//구매자가 tv, 컴퓨터, 노트북을 구매한다.
		//슈퍼 컴퓨터는 너무 비싸 구매할 수 없다.
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Notebook());
		b.buy(new SuperComputer());
		
		//tv 기능 테스트
		Tv t = new Tv();
		t.turnOn();
		t.turnOn();
		t.turnOff();
		t.turnOff();
		t.repair();
		t.renew();
		System.out.println("-----------------------------");
		//computer 기능 테스트
		Computer c = new Computer();
		c.turnOn();
		c.turnOn();
		c.turnOff();
		c.turnOff();
		c.repair();
		c.renew();
		System.out.println("-----------------------------");
		Notebook n = new Notebook();
		n.turnOn();
		n.turnOn();
		n.turnOff();
		n.turnOff();
		n.repair();
		n.renew();
		
	}
}
