package interfaceEx.lht;

public class SuperComputer extends eProduct {
	
	public SuperComputer() {
		this.price= 1000000000;
	}
	
	public SuperComputer(int price) {
		this.price=price;
	}
	
	public SuperComputer(String name, int price){
		super("SuperComputer", price);
	}
	public String toString() {
		return "SuperComputer";
	}
}
