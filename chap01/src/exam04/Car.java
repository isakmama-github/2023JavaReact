package exam04;

public class Car {
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	public Car() {
		this("그랜저", "흰색", 450);
	}
	
	public Car(String model) {
//		this.model = model;
		this(model, "흰색", 450);
	}
	
	public Car(String model, String color) {
//		this.model = model;
		//this(model);
//		this.color = color;
		this(model, color, 450);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
//		this(model, color);
		this.maxSpeed = maxSpeed;
	}
	
	
}
