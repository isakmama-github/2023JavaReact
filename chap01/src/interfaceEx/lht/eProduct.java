package interfaceEx.lht;

public class eProduct implements Interface {

	String name;
	int price;
	boolean power;
	
	eProduct(){}
	
	eProduct(int price){
		this.price=price;
	}
	eProduct(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	@Override
	public void turnOn() {
		if(power) {
			System.out.println("전원이 이미 켜져있습니다.");
		}
		else {
			power = !(power);
			System.out.println("전원을 킵니다");
		}
	}

	@Override
	public void turnOff() {
		if(!(power)) {
			System.out.println("전원이 이미 꺼져있습니다.");
		}
		else {
			power = !(power);
			System.out.println("전원을 끕니다.");
		}

	}
	
	@Override
	public void repair() {
		System.out.println("수리합니다.");
	}

	@Override
	public void renew() {
		System.out.println("공장 초기화를 시작합니다.");
	}

}
