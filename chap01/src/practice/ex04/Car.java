package practice.ex04;

public class Car extends Vehicle{

	int displacement;
	int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		this.color = color;
		this.speed = speed;
		this.displacement = displacement;
		this.gears = gears;
	}
	
	void show() {
		System.out.println("-------Car------");
		System.out.println("자동차의 색상:"+color);
		System.out.println("자동차의 속도:"+speed);
		System.out.println("자동차의 배기량:"+displacement);
		System.out.println("자동차의 기어단수:"+gears);
	}
}
