package practice.ex04;

public class Vehicle {
	String color;
	int speed;
	
	Vehicle(){}
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("-------Vehicle------");
		System.out.println("자동차의 색상 : "+color);
		System.out.println("자동차의 속도 : "+speed);
	}
}
