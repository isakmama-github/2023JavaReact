package interfaceEx.lht;

public class Tv extends eProduct {
	
	eProduct e = new eProduct();
	
	public Tv() {
		this.name="Tv";
		this.price=300;
	}
	
	public Tv(int price) {super(100);}
	
	public Tv(String name, int price){
		super(name, price);
	}
	
	public String toString() {
		return this.name;
	}
	@Override
	public void turnOn() {
		System.out.print(this.name);
		e.turnOn();
	}
	@Override
	public void turnOff() {
		System.out.print(this.name);e.turnOff();
	}
	@Override
	public void repair() {
		System.out.print(this.name);e.repair();
	}
	public void renew() {
		System.out.print(this.name);e.renew();
	}
	
}
