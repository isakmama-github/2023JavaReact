package interfaceEx.lht;

public class Computer extends eProduct {

	eProduct e = new eProduct();
	
	public Computer() {	
		this.name="Computer";
		this.price=180;
	}
	public Computer(int price) {super(price);}
	
	public Computer(String name, int price){
		super(name, price);
	}
	public String toString() {
		return this.name;
	}
	@Override
	public void turnOn() {
		System.out.print(this.name);e.turnOn();
	}
	@Override
	public void turnOff() {
		System.out.print(this.name);e.turnOff();

	}
	@Override
	public void repair() {
		System.out.print(this.name);e.repair();
	}	
	@Override
	public void renew() {
		System.out.print(this.name);e.renew();
	}
}
