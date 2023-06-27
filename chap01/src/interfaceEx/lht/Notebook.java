package interfaceEx.lht;

public class Notebook extends eProduct {
	
	eProduct e = new eProduct();
	
	public Notebook() {
		this.name="Notebook";
		this.price=200;
	}
	
	public Notebook(int price) {super(200);}
	
	public Notebook(String name, int price){
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
	public void renew() {
		System.out.print(this.name);e.renew();;
	}
}
