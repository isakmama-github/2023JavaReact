package exam06;

public class Ball extends Circle{
	
	private String color;
	public Ball(String color) {
		super();
		this.color = color;
	}
	public void findColor() {
		System.out.println(color + "공입니다.");
	}
	public void findVolumn() {
		System.out.println("부피는 4/3*(파이*반지름*반지름*반지름)이다");
	}
	
	public void findBallArea() {
	
	}
	public void findArea() {
		System.out.println("넓이는 4*(파이*반지름*반지름)이다.");
	}

}
